package mk.ukim.finki.backend.service.impl;

import mk.ukim.finki.backend.model.City;
import mk.ukim.finki.backend.repository.CityRepository;
import mk.ukim.finki.backend.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;


    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
