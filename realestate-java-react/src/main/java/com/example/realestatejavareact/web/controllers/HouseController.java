package com.example.realestatejavareact.web.controllers;


import com.example.realestatejavareact.entities.House;
import com.example.realestatejavareact.services.HouseService;
import com.example.realestatejavareact.web.dtos.Address;
import com.example.realestatejavareact.web.dtos.HouseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    public HouseController(HouseService houseService){
        this.houseService = houseService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HouseDTO> getAllHouses(HttpServletResponse req){
        return houseService.findAll();
    }

    @GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public HouseDTO getHouseById(@PathVariable int id, HttpServletRequest req){
        return houseService.getById(id);
    }

    @PostMapping(value = "/address", produces = MediaType.APPLICATION_JSON_VALUE)
    public HouseDTO getByAddress(@RequestBody Address address){ return houseService.getByAddress(address);}

}
