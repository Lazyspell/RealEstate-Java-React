package com.example.realestatejavareact.repositories;

import com.example.realestatejavareact.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

    Users findByUsernameAndPassword(String username, String password);

}
