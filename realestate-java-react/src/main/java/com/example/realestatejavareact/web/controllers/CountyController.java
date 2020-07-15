package com.example.realestatejavareact.web.controllers;

import com.example.realestatejavareact.entities.County;
import com.example.realestatejavareact.services.CountyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/county")
public class CountyController {

    @Autowired
    private CountyService countyService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<County> getAllCounties(){return countyService.getAllCounties();}

    @GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public County getCountyById(@PathVariable int id){return countyService.getCountyById(id);}

    @GetMapping(value = "/rank/{rank}", produces = MediaType.APPLICATION_JSON_VALUE)
    public County getCountyByRank(@PathVariable int rank){return countyService.getCountyByRank(rank);}

}
