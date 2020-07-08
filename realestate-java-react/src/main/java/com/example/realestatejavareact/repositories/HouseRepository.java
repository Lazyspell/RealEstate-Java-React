package com.example.realestatejavareact.repositories;

import com.example.realestatejavareact.entities.House;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<House, Integer> {

}
