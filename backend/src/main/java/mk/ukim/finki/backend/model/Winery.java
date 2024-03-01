package mk.ukim.finki.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity(name = "wineries")
@Table
public class Winery {

    @Id
    @SequenceGenerator(name = "winery_sequence", sequenceName = "winery_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "winery_sequence")
    private Long id;
    private String title;
    @Column(length = 10000000)
    private String link;

    @Column(name = "main_category")
    private String mainCategory;
    private String rating;
    private String reviews;
    private String address;

    @ManyToOne
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "winery", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Comment> comments;

    @OneToMany(mappedBy = "winery", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Rating> ratings;

    public Winery(String title, String link, String mainCategory, String rating, String reviews, String address, User user) {
        this.title = title;
        this.link = link;
        this.mainCategory = mainCategory;
        this.rating = rating;
        this.reviews = reviews;
        this.address = address;
        this.user = user;
    }

    public double avgRating() {
        if (ratings.size() != 0) {
            setRating(String.valueOf(ratings.stream().mapToDouble(rating -> Double.parseDouble(rating.getRating()))
                    .average().getAsDouble()));

            return Double.parseDouble(rating);
        }

        return 0;

    }

    @Override
    public String toString() {
        return String.format("Име: %s, Рејтинг: %s, Коментари: %s, Адреса: %s", title, rating, reviews, address);
    }
}
