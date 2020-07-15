package com.example.realestatejavareact.services;


import com.example.realestatejavareact.entities.House;
import com.example.realestatejavareact.exceptions.BadRequestException;
import com.example.realestatejavareact.exceptions.ResourceNotFoundException;
import com.example.realestatejavareact.repositories.HouseRepository;
import com.example.realestatejavareact.web.dtos.Address;
import com.example.realestatejavareact.web.dtos.HouseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class HouseService {

    @Autowired
    private HouseRepository houseRepository;

    @Transactional(readOnly = true)
    public List<HouseDTO> findAll(){
        List<House> allHoues = new ArrayList<>();
        List<House> emptyList = Collections.EMPTY_LIST;

        houseRepository.findAll().forEach(allHoues::add);
        if(emptyList.equals(allHoues)){

        }

        List<HouseDTO> houseDTOS = new ArrayList<>();
        for(House e : allHoues){
            HouseDTO houseDTO = new HouseDTO(e);
            houseDTOS.add(houseDTO);
        }

        return houseDTOS;
    }

    @Transactional(readOnly = true)
    public HouseDTO getById(int id){

        if(id <= 0){
            throw new BadRequestException("Invalid Id provided");
        }
        return new HouseDTO(houseRepository.findById(id).get());
    }

    @Transactional(readOnly = true)
    public HouseDTO getByAddress(Address address){

        if(address.getStreet_name() == null || address.getStreet_name().trim().equals("") || address.getStreet_number().trim().equals("") || address.getStreet_number() == null){
            throw new BadRequestException("Invalid address provided");
        }

        House retrievedHouse = houseRepository.findByStreetNameAndStreetNumber(address.getStreet_name(), address.getStreet_number());

        if(retrievedHouse == null){
            throw new ResourceNotFoundException("No house found with that address");
        }

        return new HouseDTO(retrievedHouse);
    }

}
