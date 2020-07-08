package com.example.realestatejavareact.web.controllers;


import com.example.realestatejavareact.entities.House;
import com.example.realestatejavareact.services.HouseService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/house")
public class HouseController {

    private HouseService houseService;

    public HouseController(HouseService houseService){
        this.houseService = houseService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<House> getAllHouses(HttpServletResponse req){
        return houseService.findAll();
    }


}
