package com.example.realestatejavareact.services;


import com.example.realestatejavareact.entities.House;
import com.example.realestatejavareact.exceptions.ResourceNotFoundException;
import com.example.realestatejavareact.repositories.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    @Autowired
    private HouseRepository houseRepository;


    public List<House> findAll(){
        List<House> result = (List<House>) houseRepository.findAll();

        if(result.isEmpty()){
            throw new ResourceNotFoundException("Database contains no Houses");
        }

        return result;
    }

}
