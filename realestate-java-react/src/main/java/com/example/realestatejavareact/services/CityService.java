package com.example.realestatejavareact.services;


import com.example.realestatejavareact.entities.City;
import com.example.realestatejavareact.exceptions.BadRequestException;
import com.example.realestatejavareact.exceptions.ResourceNotFoundException;
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

//    public City findById(int id){
//
//        if(id <= 0){
//            throw new BadRequestException("Provided ID is invalid");
//        }
//
//        return City cityRepository.findById(id);
//
//    }

    public City getByCityRank(int rank){
        if(rank <= 0){
            throw new BadRequestException("Invalid rank provided");
        }

        City retrievedCity = cityRepository.findByCityRank(rank);

        if(retrievedCity == null){
            throw new ResourceNotFoundException("No city found with that rank");
        }

        return retrievedCity;
    }

}
