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
import java.util.List;

@Service
public class HouseService {

    @Autowired
    private HouseRepository houseRepository;

    @Transactional(readOnly = true)
    public List<HouseDTO> findAll(){
        Iterable<House> retrievedList = houseRepository.findAll();

        List<HouseDTO> houseDTOS = new ArrayList<HouseDTO>();

        for(House house : retrievedList){
            houseDTOS.add(new HouseDTO(house));
        }

        return houseDTOS;
    }

    @Transactional(readOnly = true)
    public HouseDTO getById(int id){
        if(id <= 0){
            throw new BadRequestException("Invalid Id provided");
        }

        House retrievedHouse = houseRepository.findById(id);

        if(retrievedHouse == null){
            throw new ResourceNotFoundException("No house found with provided ID");
        }

        return new HouseDTO(retrievedHouse);
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
