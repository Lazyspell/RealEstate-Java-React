package com.example.realestatejavareact.web.controllers;


import com.example.realestatejavareact.entities.City;
import com.example.realestatejavareact.services.CityService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/city")
public class CityController {

    private CityService cityService;


    public CityController(CityService cityService){
        this.cityService = cityService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<City> getAllCities(HttpServletRequest req){
        return cityService.findAll();
    }
}
