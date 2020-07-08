package com.example.realestatejavareact.services;


import com.example.realestatejavareact.exceptions.ResourceNotFoundException;
import com.example.realestatejavareact.entities.Users;
import com.example.realestatejavareact.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

   public List<Users> findAll(){
       List<Users> result = (List<Users>) userRepository.findAll();

       if(result.isEmpty()){
           throw new ResourceNotFoundException("Database contains no Users");
       }
       return result;
   }

}
