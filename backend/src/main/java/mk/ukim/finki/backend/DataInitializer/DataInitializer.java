package mk.ukim.finki.backend.DataInitializer;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.backend.model.City;
import mk.ukim.finki.backend.model.User;
import mk.ukim.finki.backend.model.Winery;
import mk.ukim.finki.backend.model.enumerations.Role;
import mk.ukim.finki.backend.repository.CityRepository;
import mk.ukim.finki.backend.repository.UserRepository;
import mk.ukim.finki.backend.repository.WineryRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final WineryRepository wineryRepository;
    private final CityRepository cityRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DataInitializer(WineryRepository wineryRepository, CityRepository cityRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.wineryRepository = wineryRepository;
        this.cityRepository = cityRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void init() {
        User user = new User("admin", "Admin", "Admin",
                "admin@gmail.com", passwordEncoder.encode("admin"), Role.valueOf("ROLE_ADMIN"));
        userRepository.save(user);

        wineryRepository.save(new Winery("Винарија „Камник“", "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%9A%D0%B0%D0%BC%D0%BD%D0%B8%D0%BA%E2%80%9C/data=!4m7!3m6!1s0x13543fcf77ad885f:0x6ac9fa6e7a97b908!8m2!3d42.0077507!4d21.4902834!16s%2Fg%2F1q6cn1t0j!19sChIJX4itd88_VBMRCLmXem76yWo?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Камник“, Kamnik bb Skopje MK, 1000", user));
        wineryRepository.save(new Winery("Винарија „Картал“", "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%9A%D0%B0%D1%80%D1%82%D0%B0%D0%BB%E2%80%9C/data=!4m7!3m6!1s0x13543dff9421642f:0x517feae3f45925b0!8m2!3d41.962434!4d21.4763996!16s%2Fg%2F1tg7p8s1!19sChIJL2QhlP89VBMRsCVZ9OPqf1E?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Картал“, ul.1519 br.7 Skopje MK, 1000", user));
        wineryRepository.save(new Winery("Семејна винарија „Захарчев“", "https://www.google.com/maps/place/%D0%A1%D0%B5%D0%BC%D0%B5%D1%98%D0%BD%D0%B0+%D0%B2%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%97%D0%B0%D1%85%D0%B0%D1%80%D1%87%D0%B5%D0%B2%E2%80%9C/data=!4m7!3m6!1s0x135665e40edeac9b:0x6c17e19f76542bde!8m2!3d41.4360468!4d22.0048696!16s%2Fg%2F11jcmk_58j!19sChIJm6zeDuRlVhMR3itUdp_hF2w?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Картал“, ul.1519 br.7 Skopje MK, 1000", user));
        wineryRepository.save(new Winery("Винарија „Венец“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%92%D0%B5%D0%BD%D0%B5%D1%86%E2%80%9C/data=!4m7!3m6!1s0x13566fb2f2bc247f:0xa37feab87bb9c809!8m2!3d41.433904!4d22.092974!16s%2Fg%2F11c6f0xmqz!19sChIJfyS88rJvVhMRCci5e7jqf6M?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Венец“, s Dolni Disan, Negotino 1443", user));
        wineryRepository.save(new Winery("Winery Kuvin",
                "https://www.google.com/maps/place/Winery+Kuvin/data=!4m7!3m6!1s0x1354132410f1da33:0x905f4f4da547d5b7!8m2!3d42.0094835!4d21.351241!16s%2Fg%2F11h3v79f85!19sChIJM9rxECQTVBMRt9VHpU1PX5A?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Winery Kuvin, Македонска Преродба бр.70, Скопје 1000", user));
        wineryRepository.save(new Winery("Винарија „Попова кула“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%9F%D0%BE%D0%BF%D0%BE%D0%B2%D0%B0+%D0%BA%D1%83%D0%BB%D0%B0%E2%80%9C/data=!4m10!3m9!1s0x13566d39fec02077:0xa49c20b9625aebf0!5m2!4m1!1i2!8m2!3d41.410885!4d22.226565!16s%2Fg%2F11gzlcxwc!19sChIJdyDA_jltVhMR8OtaYrkgnKQ?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Попова кула“, Wine Boulevard No.1, Демир Капија 1442", user));
        wineryRepository.save(new Winery("Royal winery „Queen Maria“",
                "https://www.google.com/maps/place/Royal+winery+%E2%80%9EQueen+Maria%E2%80%9C/data=!4m10!3m9!1s0x13566dcc0361b05b:0xc2baa39fb3d0ce90!5m2!4m1!1i2!8m2!3d41.4140987!4d22.233366!16s%2Fg%2F11sfjw5knf!19sChIJW7BhA8xtVhMRkM7Qs5-jusI?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Royal winery „Queen Maria“, Marshal Tito 63, 1442", user));
        wineryRepository.save(new Winery("Alesto Winery",
                "https://www.google.com/maps/place/Alesto+Winery/data=!4m7!3m6!1s0x13573540fbc6031b:0x42c57259b952dab!8m2!3d40.9429755!4d21.1120544!16s%2Fg%2F11v69zzy_z!19sChIJGwPG-0A1VxMRqy2VmyVXLAQ?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Alesto Winery, Arvati", user));
        wineryRepository.save(new Winery("Винарија „Брзанов“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%91%D1%80%D0%B7%D0%B0%D0%BD%D0%BE%D0%B2%E2%80%9C/data=!4m7!3m6!1s0x135413921071ee01:0x87b15079b652e059!8m2!3d41.9856456!4d21.5171839!16s%2Fg%2F11bw3b9spd!19sChIJAe5xEJITVBMRWeBStnlQsYc?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Брзанов“, ul 1 br. 4 MK, Трубарево 1047", user));
        wineryRepository.save(new Winery("Monastery Winery",
                "https://www.google.com/maps/place/Monastery+Winery/data=!4m7!3m6!1s0x1350d9091bdafb7d:0x2e253af981744bf!8m2!3d41.1847951!4d20.8772488!16s%2Fg%2F11qntl4s5k!19sChIJffvaGwnZUBMRv0QXmK9T4gI?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Monastery Winery, MK, Охрид 6000", user));

        wineryRepository.save(new Winery("Семејна винарија „Пешков“",
                "https://www.google.com/maps/place/%D0%A1%D0%B5%D0%BC%D0%B5%D1%98%D0%BD%D0%B0+%D0%B2%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%9F%D0%B5%D1%88%D0%BA%D0%BE%D0%B2%E2%80%9C/data=!4m7!3m6!1s0x1356658a0a98980f:0x72102dca23be845f!8m2!3d41.4257426!4d22.0039158!16s%2Fg%2F11px9m2_v4!19sChIJD5iYCoplVhMRX4S-I8otEHI?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "C2G3+7HV Семејна винарија „Пешков“, Кавадарци", user));

        wineryRepository.save(new Winery("Винарска визба Валандово",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D1%81%D0%BA%D0%B0+%D0%B2%D0%B8%D0%B7%D0%B1%D0%B0+%D0%92%D0%B0%D0%BB%D0%B0%D0%BD%D0%B4%D0%BE%D0%B2%D0%BE/data=!4m7!3m6!1s0x13561c517df93a59:0xfbc1ca62d57c466b!8m2!3d41.3195595!4d22.5663368!16s%2Fg%2F1hc1_vpdf!19sChIJWTr5fVEcVhMRa0Z81WLKwfs?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарска визба Валандово, Orce Nikolov 6, Valandovo 2460", user));

        wineryRepository.save(new Winery("Винарија „Попов“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%9F%D0%BE%D0%BF%D0%BE%D0%B2%E2%80%9C/data=!4m7!3m6!1s0x13567ac0e384436d:0xbfd2237c419ba5b7!8m2!3d41.4915359!4d22.0213826!16s%2Fg%2F1ptxlzbsw!19sChIJbUOE48B6VhMRt6WbQXwj0r8?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "F2RC+JH6 Винарија „Попов“, Сопот", user));

        wineryRepository.save(new Winery("Винарија „Стоби“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%A1%D1%82%D0%BE%D0%B1%D0%B8%E2%80%9C/data=!4m7!3m6!1s0x13567ebbbb364e1b:0x25d7fc5b7d08fff6!8m2!3d41.5812326!4d21.9362267!16s%2Fg%2F1hc1q6g3l!19sChIJG042u7t-VhMR9v8IfVv81yU?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Стоби“, Avtopat b.b., Градско 1400", user));

        wineryRepository.save(new Winery("Vardar Winery & Wines",
                "https://www.google.com/maps/place/Vardar+Winery+%26+Wines/data=!4m7!3m6!1s0x135415b55c9e607f:0x2f8bed550ba6d940!8m2!3d41.9946606!4d21.4280648!16s%2Fg%2F11fn6t056p!19sChIJf2CeXLUVVBMRQNmmC1Xtiy8?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Vardar Winery & Wines, Даме Груев, Скопје 1000", user));

        wineryRepository.save(new Winery("Винарија „Ерос“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%95%D1%80%D0%BE%D1%81%E2%80%9C/data=!4m7!3m6!1s0x135665d9b746d305:0x6ad315350f926dda!8m2!3d41.4667585!4d22.0301764!16s%2Fg%2F11fppgwhhh!19sChIJBdNGt9llVhMR2m2SDzUV02o?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Ерос“, MK, Marshal Tito 59, Marena 1430", user));

        wineryRepository.save(new Winery("Winery „Chateau Sopot“",
                "https://www.google.com/maps/place/Winery+%E2%80%9EChateau+Sopot%E2%80%9C/data=!4m7!3m6!1s0x13542ebe4c77e6bd:0x278ea50e1087fd17!8m2!3d41.7777559!4d21.7409903!16s%2Fg%2F11c6lty549!19sChIJveZ3TL4uVBMRF_2HEA6ljic?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Winery „Chateau Sopot“, MK, Велес 1400", user));

        wineryRepository.save(new Winery("S&S Winery",
                "https://www.google.com/maps/place/S%26S+Winery/data=!4m7!3m6!1s0x1350ddff893528fd:0xdd6e56782d8c0a9d!8m2!3d41.1384154!4d20.7757859!16s%2Fg%2F11pz721f_q!19sChIJ_Sg1if_dUBMRnQqMLXhWbt0?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "S&S Winery, Охрид", user));

        wineryRepository.save(new Winery("Vardar Winery & Wines",
                "https://www.google.com/maps/place/Vardar+Winery+%26+Wines/data=!4m7!3m6!1s0x13541438278191cb:0x3a9e4e26b7e5fe0e!8m2!3d41.9929627!4d21.4158512!16s%2Fg%2F11hdy2l1cz!19sChIJy5GBJzgUVBMRDv7ltyZOnjo?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Vardar Winery & Wines, Васил Ѓоргов, Скопје 1000", user));

        wineryRepository.save(new Winery("Винарија - Мал Свети Климент",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+-+%D0%9C%D0%B0%D0%BB+%D0%A1%D0%B2%D0%B5%D1%82%D0%B8+%D0%9A%D0%BB%D0%B8%D0%BC%D0%B5%D0%BD%D1%82/data=!4m7!3m6!1s0x1350dca4c3176cd7:0x9c1e55e2731e35b6!8m2!3d41.1126065!4d20.7969222!16s%2Fg%2F11c6rqn7xg!19sChIJ12wXw6TcUBMRtjUec-JVHpw?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија - Мал Свети Климент, Metodi Patče 8, Охрид 6000", user));

        wineryRepository.save(new Winery("Filovski Winery",
                "https://www.google.com/maps/place/Filovski+Winery/data=!4m7!3m6!1s0x135415c9cf6854f3:0x7b130ac0233b4c70!8m2!3d41.9922146!4d21.4342922!16s%2Fg%2F11hyt0x2vq!19sChIJ81Roz8kVVBMRcEw7I8AKE3s?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Filovski Winery, 23, 11-ти Октомври 1/1, Скопје 1000", user));

        wineryRepository.save(new Winery("OldSchoolWinery",
                "https://www.google.com/maps/place/OldSchoolWinery/data=!4m7!3m6!1s0x13542d2eb9795bd1:0xf214c5980f9bce56!8m2!3d41.7736154!4d21.767121!16s%2Fg%2F11k5z2k13y!19sChIJ0Vt5uS4tVBMRVs6bD5jFFPI?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "OldSchoolWinery, Lake Mladost Veles MK, 1400", user));

        wineryRepository.save(new Winery("Sarika Winery",
                "https://www.google.com/maps/place/Sarika+Winery/data=!4m7!3m6!1s0x1356eb3e747608a5:0x5583f7afbf47083c!8m2!3d41.3403377!4d21.5624017!16s%2Fg%2F11n0h1kc5w!19sChIJpQh2dD7rVhMRPAhHv6_3g1U?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Sarika Winery, Мирче Ацев 128, Прилеп 7500", user));

        wineryRepository.save(new Winery("Винарска визба Тиквеш АД Скопје",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D1%81%D0%BA%D0%B0+%D0%B2%D0%B8%D0%B7%D0%B1%D0%B0+%D0%A2%D0%B8%D0%BA%D0%B2%D0%B5%D1%88+%D0%90%D0%94+%D0%A1%D0%BA%D0%BE%D0%BF%D1%98%D0%B5/data=!4m7!3m6!1s0x135415823632cbc1:0x8657700495e37d67!8m2!3d42.001556!4d21.467886!16s%2Fg%2F11d_d2tysn!19sChIJwcsyNoIVVBMRZ33jlQRwV4Y?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарска визба Тиквеш АД Скопје, 810 no. 2, Скопје 1000", user));

        wineryRepository.save(new Winery("Винарија „Бади“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%91%D0%B0%D0%B4%D0%B8%E2%80%9C/data=!4m7!3m6!1s0x1356659d99392ffb:0x1ec9e44a4d7d32b0!8m2!3d41.4321479!4d22.0061189!16s%2Fg%2F11r4lrwcqz!19sChIJ-y85mZ1lVhMRsDJ9TUrkyR4?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Бади“, Pere Toshev 3, Kavadartsi 1430", user));

        wineryRepository.save(new Winery("Bela Voda - Tikves Winery Vineyadrs",
                "https://www.google.com/maps/place/Bela+Voda+-+Tikves+Winery+Vineyadrs/data=!4m7!3m6!1s0x13542dd1cb75ce8f:0x53a93ffc762690c5!8m2!3d41.7988315!4d21.7721987!16s%2Fg%2F1jkvs5dz_!19sChIJj851y9EtVBMRxZAmdvw_qVM?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "QQXC+GVP Bela Voda - Tikves Winery Vineyadrs, Сојаклари", user));

        wineryRepository.save(new Winery("Езимит",
                "https://www.google.com/maps/place/%D0%95%D0%B7%D0%B8%D0%BC%D0%B8%D1%82/data=!4m7!3m6!1s0x1355c304710b43e1:0x1b20c39ea4a545cb!8m2!3d41.7755648!4d22.18112!16s%2Fg%2F1q64w37cx!19sChIJ4UMLcQTDVRMRy0WlpJ7DIBs?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Езимит, Ul. Bregalnicka 64a, Штип", user));

        wineryRepository.save(new Winery("Винарија „Чифлик“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%A7%D0%B8%D1%84%D0%BB%D0%B8%D0%BA%E2%80%9C/data=!4m10!3m9!1s0x13572564f8f96697:0x5b58b2fba7eb0d46!5m2!4m1!1i2!8m2!3d41.0319937!4d21.2929092!16s%2Fg%2F11fy2qrtyx!19sChIJl2b5-GQlVxMRRg3rp_uyWFs?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Чифлик“, 2 br.18 Brusnik, Битола", user));

        wineryRepository.save(new Winery("Домашни вина „Иванов“",
                "https://www.google.com/maps/place/%D0%94%D0%BE%D0%BC%D0%B0%D1%88%D0%BD%D0%B8+%D0%B2%D0%B8%D0%BD%D0%B0+%E2%80%9E%D0%98%D0%B2%D0%B0%D0%BD%D0%BE%D0%B2%E2%80%9C/data=!4m7!3m6!1s0x1356650a910b4455:0xb9842d6ad00757f1!8m2!3d41.4358661!4d22.0053509!16s%2Fg%2F11n0pq7140!19sChIJVUQLkQplVhMR8VcH0GothLk?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Домашни вина „Иванов“, MK MK, Игман 11, Кавадарци 1430", user));

        wineryRepository.save(new Winery("Борд лајф",
                "https://www.google.com/maps/place/%D0%91%D0%BE%D1%80%D0%B4+%D0%BB%D0%B0%D1%98%D1%84/data=!4m7!3m6!1s0x135412c4fdb7f3a3:0xf85d7f59de69367f!8m2!3d42.0586418!4d21.3176565!16s%2Fg%2F11fzb18m6n!19sChIJo_O3_cQSVBMRfzZp3ll_Xfg?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Борд лајф, 1106, Skopje 1000, Скопје", user));

        wineryRepository.save(new Winery("Винарија Мирон (Miron winery)",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%D0%9C%D0%B8%D1%80%D0%BE%D0%BD+%28Miron+winery%29/data=!4m7!3m6!1s0x13543f5708a13209:0x53370ebb4caa5761!8m2!3d42.0022688!4d21.498154!16s%2Fg%2F11kqwlssyf!19sChIJCTKhCFc_VBMRYVeqTLsON1M?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија Мирон (Miron winery), Palmiro Toljati 88, Скопје 1000", user));

        wineryRepository.save(new Winery("Винарија Тристо - Tristo Winery",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%D0%A2%D1%80%D0%B8%D1%81%D1%82%D0%BE+-+Tristo+Winery/data=!4m7!3m6!1s0x13542db3165b705b:0x122c0a2ea73d8f61!8m2!3d41.7889769!4d21.7932594!16s%2Fg%2F11b75jm9m0!19sChIJW3BbFrMtVBMRYY89py4KLBI?authuser=0&hl=mk&rclk=1",
                "Лозје", "0", "0", "Винарија Тристо - Tristo Winery, Гоце Делчев", user));

        wineryRepository.save(new Winery("Винарија „Грков“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%93%D1%80%D0%BA%D0%BE%D0%B2%E2%80%9C/data=!4m7!3m6!1s0x135669ef389d8831:0x7623b0ac8fbbb2d7!8m2!3d41.3125587!4d22.1266275!16s%2Fg%2F1td8w2l9!19sChIJMYidOO9pVhMR17K7j6ywI3Y?authuser=0&hl=mk&rclk=1",
                "Лозје", "0", "0", "Винарија „Грков“, 109, 1437", user));

        wineryRepository.save(new Winery("Винарија „Имако вино“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%98%D0%BC%D0%B0%D0%BA%D0%BE+%D0%B2%D0%B8%D0%BD%D0%BE%E2%80%9C/data=!4m7!3m6!1s0x1355dc6c2b48e94f:0x6e907674139ba6d0!8m2!3d41.7016794!4d22.1561355!16s%2Fg%2F1tf8w7_l!19sChIJT-lIK2zcVRMR0KabE3R2kG4?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "M5X4+MX Винарија „Имако вино“, 6th km local road Stip-Radovis MK, Sofilari 2000", user));

        wineryRepository.save(new Winery("Винарија Далвина",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%D0%94%D0%B0%D0%BB%D0%B2%D0%B8%D0%BD%D0%B0/data=!4m7!3m6!1s0x14aa026de2bba317:0x3d7e4e1fe67a87e6!8m2!3d41.4899341!4d22.7446734!16s%2Fg%2F11gg657hqd!19sChIJF6O74m0CqhQR5od65h9Ofj0?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија Далвина, R1302, Hamzali 2431", user));

        wineryRepository.save(new Winery("Винарија Охрид",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%D0%9E%D1%85%D1%80%D0%B8%D0%B4/data=!4m7!3m6!1s0x1350dc904ea7215b:0x4b3afab64b681b9a!8m2!3d41.1279708!4d20.7930905!16s%2Fg%2F11r8cdcjl!19sChIJWyGnTpDcUBMRmhtoS7b6Oks?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "4QHV+56P Винарија Охрид, Бул. Железничка ББ, Охрид 6000", user));

        wineryRepository.save(new Winery("Винарија „Домен Лепово“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%94%D0%BE%D0%BC%D0%B5%D0%BD+%D0%9B%D0%B5%D0%BF%D0%BE%D0%B2%D0%BE%E2%80%9C/data=!4m7!3m6!1s0x13567a64c2adb81d:0x7978f58b1d7adc22!8m2!3d41.5176405!4d22.0342244!16s%2Fg%2F1q6csxbvp!19sChIJHbitwmR6VhMRItx6HYv1eHk?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Домен Лепово“, Неготино", user));

        wineryRepository.save(new Winery("Винарија Трајковски",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%D0%A2%D1%80%D0%B0%D1%98%D0%BA%D0%BE%D0%B2%D1%81%D0%BA%D0%B8/data=!4m7!3m6!1s0x135669e4705050cb:0x234d02000f0710c6!8m2!3d41.3069414!4d22.1272239!16s%2Fg%2F1hc2488mp!19sChIJy1BQcORpVhMRxhAHDwACTSM?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија Трајковски, 109, Krnjevo", user));

        wineryRepository.save(new Winery("Винарија „Бовин“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%91%D0%BE%D0%B2%D0%B8%D0%BD%E2%80%9C/data=!4m7!3m6!1s0x1356705309862687:0x8aa5491e2c39ad8d!8m2!3d41.4933002!4d22.0924896!16s%2Fg%2F1hd_c_wxw!19sChIJhyaGCVNwVhMRja05LB5JpYo?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Бовин“, Индустриска, Неготино 1440", user));

        wineryRepository.save(new Winery("GD Tikves Winery",
                "https://www.google.com/maps/place/GD+Tikves+Winery/data=!4m7!3m6!1s0x135663d19c010ab7:0x97d8f9386e59b0cc!8m2!3d41.475839!4d21.9211189!16s%2Fg%2F11rz3_jw1_!19sChIJtwoBnNFjVhMRzLBZbjj52Jc?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "GD Tikves Winery, Ul. Kamendol - Trstenik S MK, Trstenik 1422", user));

        wineryRepository.save(new Winery("MILEV Winery",
                "https://www.google.com/maps/place/MILEV+Winery/data=!4m7!3m6!1s0x135663b7e87b29b9:0x10e3bdc488791d5a!8m2!3d41.4758331!4d21.9211223!16s%2Fg%2F11kbkh2b_j!19sChIJuSl76LdjVhMRWh15iMS94xA?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "MILEV Winery, Ul. Kamendol - Trstenik S, Trstenik 1422", user));

        wineryRepository.save(new Winery("Винарија „Мовино“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%9C%D0%BE%D0%B2%D0%B8%D0%BD%D0%BE%E2%80%9C/data=!4m7!3m6!1s0x13567bc1a1621d33:0x4c5a3553cf6f372e!8m2!3d41.5214442!4d21.9646746!16s%2Fg%2F11gr4bb2cz!19sChIJMx1iocF7VhMRLjdvz1M1Wkw?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "GXC7+HVF Винарија „Мовино“, MK, Industriska BB, Rosoman 1422", user));

        wineryRepository.save(new Winery("Семејни вина Коцев",
                "https://www.google.com/maps/place/%D0%A1%D0%B5%D0%BC%D0%B5%D1%98%D0%BD%D0%B8+%D0%B2%D0%B8%D0%BD%D0%B0+%D0%9A%D0%BE%D1%86%D0%B5%D0%B2/data=!4m7!3m6!1s0x13542bfb56412d19:0x873cb73ac8257d26!8m2!3d41.7096692!4d21.787771!16s%2Fg%2F11j4jrvhd_!19sChIJGS1BVvsrVBMRJn0lyDq3PIc?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Семејни вина Коцев, Прохор Пчински, Велес", user));

        wineryRepository.save(new Winery("Винарија „Парагон“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%9F%D0%B0%D1%80%D0%B0%D0%B3%D0%BE%D0%BD%E2%80%9C/data=!4m7!3m6!1s0x13567139b994cf8b:0x5f0c84a7e575e9b!8m2!3d41.5220625!4d22.1153125!16s%2Fg%2F11c594rw3d!19sChIJi8-UuTlxVhMRm15XfkrI8AU?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "G4C8+R4 Винарија „Парагон“, Криволак 1440", user));

        wineryRepository.save(new Winery("Винарија „Лазар“",
                "https://www.google.com/maps/place/%D0%92%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%9B%D0%B0%D0%B7%D0%B0%D1%80%E2%80%9C/data=!4m10!3m9!1s0x13567bebc891de71:0x44f9c6935fb40042!5m2!4m1!1i2!8m2!3d41.546456!4d21.9724705!16s%2Fg%2F11c809r910!19sChIJcd6RyOt7VhMRQgC0X5PG-UQ?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Винарија „Лазар“, Naseleno mesto bez ulicen sistem MK, Stobi, Паликура 1422", user));

        wineryRepository.save(new Winery("Skovin Winery",
                "https://www.google.com/maps/place/Skovin+Winery/data=!4m7!3m6!1s0x135415c8e1636229:0x8b677f7e53420410!8m2!3d41.987347!4d21.436772!16s%2Fg%2F11f3tt8whp!19sChIJKWJj4cgVVBMREARCU35_Z4s?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Skovin Winery, 11-ти Октомври локал 306, Скопје 1000", user));

        wineryRepository.save(new Winery("Стефан",
                "https://www.google.com/maps/place/%D0%A1%D1%82%D0%B5%D1%84%D0%B0%D0%BD/data=!4m7!3m6!1s0x135665ab19996549:0x71412bfb23cf1cd4!8m2!3d41.438669!4d22.001734!16s%2Fg%2F11cjk565kq!19sChIJSWWZGatlVhMR1BzPI_srQXE?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Стефан, 41°26'19. 22°00'06.2\"E, Булевар Македонија 2, Кавадарци", user));

        wineryRepository.save(new Winery("Кралска винарија „Кралица Марија“",
                "https://www.google.com/maps/place/%D0%9A%D1%80%D0%B0%D0%BB%D1%81%D0%BA%D0%B0+%D0%B2%D0%B8%D0%BD%D0%B0%D1%80%D0%B8%D1%98%D0%B0+%E2%80%9E%D0%9A%D1%80%D0%B0%D0%BB%D0%B8%D1%86%D0%B0+%D0%9C%D0%B0%D1%80%D0%B8%D1%98%D0%B0%E2%80%9C/data=!4m10!3m9!1s0x13566d3e73a9fad3:0x8ee05070c38fd6a!5m2!4m1!1i2!8m2!3d41.41392!4d22.233563!16s%2Fg%2F11f7r03b61!19sChIJ0_qpcz5tVhMRav04DAcF7gg?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Кралска винарија „Кралица Марија“, Marshal Tito 63, 1442", user));

        wineryRepository.save(new Winery("Plus Ingenering",
                "https://www.google.com/maps/place/Plus+Ingenering/data=!4m7!3m6!1s0x13541500c6b1e7e7:0x2816cc7d557d9b61!8m2!3d42.0118414!4d21.4324617!16s%2Fg%2F11dynzqfc4!19sChIJ5-exxgAVVBMRYZt9VX3MFig?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "2C6J+PXP Plus Ingenering, Македонско Косовска Бригада, Скопје 1000", user));

        wineryRepository.save(new Winery("Аневски Винерија",
                "https://www.google.com/maps/place/%D0%90%D0%BD%D0%B5%D0%B2%D1%81%D0%BA%D0%B8+%D0%92%D0%B8%D0%BD%D0%B5%D1%80%D0%B8%D1%98%D0%B0/data=!4m7!3m6!1s0x1355c336a04a81d9:0x7727b3e4eb230051!8m2!3d41.7546567!4d22.1714311!16s%2Fg%2F11d_txmhrl!19sChIJ2YFKoDbDVRMRUQAj6-SzJ3c?authuser=0&hl=mk&rclk=1",
                "Винарија", "0", "0", "Q53C+VH7 Аневски Винерија, Штип", user));


        cityRepository.save(new City("Bitola", 41.031788238019, 21.3352288665444));
        cityRepository.save(new City("Gevgelija", 41.13886640040736, 22.5033192));
        cityRepository.save(new City("Gostivar", 41.79202220046988, 20.9081703));
        cityRepository.save(new City("Kavadarci", 41.4332802004375, 22.0122593));
        cityRepository.save(new City("Kichevo", 41.50890370044473, 20.9585155));
        cityRepository.save(new City("Kochani", 41.921133200480256, 22.4114182));
        cityRepository.save(new City("Kumanovo", 42.135945900495926, 21.7177635));
        cityRepository.save(new City("Ohrid", 41.11702030040502, 20.8017387));
        cityRepository.save(new City("Prilep", 41.34772585779614, 21.551559931113783));
        cityRepository.save(new City("Shtip", 41.73747240046529, 22.1935856));
        cityRepository.save(new City("Skopje", 41.99609240048596, 21.431649499999995));
        cityRepository.save(new City("Strumica", 41.43920450043807, 22.6397203));
        cityRepository.save(new City("Tetovo", 42.00682970048675, 20.972855599999995));
        cityRepository.save(new City("Veles", 41.71886900046368, 21.7705695));
        cityRepository.save(new City("Berovo", 41.70666800046263, 22.853555900000003));
        cityRepository.save(new City("Bogdanci", 41.20160700041404, 22.577651999999997));
        cityRepository.save(new City("Delchevo", 41.966834400483755, 22.776772199999996));
        cityRepository.save(new City("Demir Hisar", 41.21989670041595, 21.2020872));
        cityRepository.save(new City("Demir Kapija", 41.4087136004351, 22.2418571));
        cityRepository.save(new City("Kratovo", 42.079261000492, 22.180218199999995));
        cityRepository.save(new City("Kriva Palanka", 42.19809520050006, 22.3316944));
        cityRepository.save(new City("Krushevo", 41.36750330043104, 21.2482775));
        cityRepository.save(new City("Makedonski Brod", 41.507489000444615, 21.2165416));
        cityRepository.save(new City("Negotino", 41.48396800044237, 22.0889394));
        cityRepository.save(new City("Probishtip", 41.99983860048623, 22.178476700000004));
        cityRepository.save(new City("Radovish", 41.63983200045677, 22.4645893));
        cityRepository.save(new City("Resen", 41.08529190040157, 21.008460499999998));
        cityRepository.save(new City("Struga", 41.177027800411445, 20.679058599999998));
        cityRepository.save(new City("Sveti Nikole", 41.864733900475805, 21.9420506));
        cityRepository.save(new City("Valandovo", 41.317341900426, 22.561976499999997));
        cityRepository.save(new City("Vinica", 41.88284018438791, 22.509529957212987));

    }
}
