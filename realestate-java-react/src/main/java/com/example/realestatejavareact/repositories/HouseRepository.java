package com.example.realestatejavareact.repositories;

import com.example.realestatejavareact.entities.House;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<House, Integer> {

    House findById(int id);

    @Query("from House h where h.street_name = :streetName and h.street_number = :streetNumber")
    House findByStreetNameAndStreetNumber(String streetName, String streetNumber);

}
