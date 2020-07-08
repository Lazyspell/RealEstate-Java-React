package com.example.realestatejavareact.services;


import com.example.realestatejavareact.entities.City;
import com.example.realestatejavareact.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> findAll(){

        return ((List<City>) cityRepository.findAll());
    }

}
