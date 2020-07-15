package com.example.realestatejavareact.services;

import com.example.realestatejavareact.entities.County;
import com.example.realestatejavareact.exceptions.BadRequestException;
import com.example.realestatejavareact.exceptions.ResourceNotFoundException;
import com.example.realestatejavareact.repositories.CountyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountyService {

    @Autowired
    private CountyRepository countyRepository;

    @Transactional(readOnly = true)
    public List<County> getAllCounties(){
        Iterable<County> retrievedCounties = countyRepository.findAll();

        List<County> counties = new ArrayList<County>();

        for(County county : retrievedCounties){
            counties.add(county);
        }

        if(counties.isEmpty()){
            throw new ResourceNotFoundException("No Counties found in the database");
        }

        return counties;
    }

    @Transactional(readOnly = true)
    public County getCountyById(int id){
        if(id <= 0){
            throw new BadRequestException("Invalid id was given");
        }

        County retrievedCounty = countyRepository.findById(id);

        if(retrievedCounty == null){
            throw new ResourceNotFoundException("No County found with given Id");
        }

        return retrievedCounty;
    }

    @Transactional(readOnly = true)
    public County getCountyByRank(int rank){
        if(rank <= 0){
            throw new BadRequestException("Invalid rank given");
        }

        County retrievedCounty = countyRepository.findByCountyRank(rank);

        if(retrievedCounty == null){
            throw new ResourceNotFoundException("No County found with that rank");
        }

        return retrievedCounty;
    }

}
