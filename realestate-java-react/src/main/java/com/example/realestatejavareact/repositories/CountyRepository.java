package com.example.realestatejavareact.repositories;

import com.example.realestatejavareact.entities.County;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountyRepository extends CrudRepository<County, Integer> {

    County findById(int id);

    @Query("from County c where c.county_rank = :rank")
    County findByCountyRank(int rank);

}
