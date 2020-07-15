package com.example.realestatejavareact.web.controllers;


import com.example.realestatejavareact.entities.City;
import com.example.realestatejavareact.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    public CityController(CityService cityService){
        this.cityService = cityService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<City> getAllCities(HttpServletRequest req){
        return cityService.findAll();
    }

    @GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public City getById(@PathVariable int id){return cityService.findById(id);}

    @GetMapping(value = "/rank/{rank}", produces = MediaType.APPLICATION_JSON_VALUE)
    public City getByCityRank(@PathVariable int rank){return cityService.getByCityRank(rank);}
}
