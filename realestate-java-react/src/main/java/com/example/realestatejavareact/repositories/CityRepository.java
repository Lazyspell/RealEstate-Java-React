package com.example.realestatejavareact.repositories;


import com.example.realestatejavareact.entities.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Integer> {
}