package com.example.realestatejavareact.services;


import com.example.realestatejavareact.exceptions.AuthenticationException;
import com.example.realestatejavareact.exceptions.BadRequestException;
import com.example.realestatejavareact.exceptions.ResourceNotFoundException;
import com.example.realestatejavareact.entities.Users;
import com.example.realestatejavareact.exceptions.ResourcePersistenceException;
import com.example.realestatejavareact.repositories.UserRepository;
import com.example.realestatejavareact.web.dtos.Credentials;
import com.example.realestatejavareact.web.dtos.Principal;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> findAll(){

       return ((List<Users>) userRepository.findAll());
    }

    public Principal login(Credentials credentials){

        if(
            credentials.getUsername() == null || credentials.getUsername().trim().equals("") ||
            credentials.getPassword() == null || credentials.getPassword().trim().equals("")
        ){
            throw new AuthenticationException("Invalid Credentials!");
        }

        Users retrievedUser = userRepository.findByUsernameAndPassword(credentials.getUsername(), credentials.getPassword());

        return new Principal(retrievedUser);

    }

    @Transactional
    public Users register(Users newUser){

        if(
            newUser.getFirst_name() == null || newUser.getFirst_name().trim().equals("") ||
            newUser.getLast_name() == null || newUser.getLast_name().trim().equals("") ||
            newUser.getEmail() == null || newUser.getEmail().trim().equals("") ||
            newUser.getPassword() == null || newUser.getPassword().trim().equals("") ||
            newUser.getUsername() == null || newUser.getUsername().trim().equals("") ||
            newUser.getRole() == null
        ){
            throw new BadRequestException("Invalid user was input");
        }

        boolean conflictingUsername = doesUsernameExist(newUser.getUsername());

        if(!conflictingUsername){
            throw new ResourcePersistenceException("Username already exists");
        }

        boolean conflictingEmail = doesEmailExist(newUser.getEmail());

        if(!conflictingEmail){
            throw new ResourcePersistenceException("Email already exists");
        }

        return userRepository.save(newUser);

    }

    @Transactional(readOnly = true)
    private boolean doesUsernameExist(String username){

        Users conflictingUser = userRepository.findByUsername(username);

        return conflictingUser == null;

    }

    @Transactional(readOnly = true)
    private boolean doesEmailExist(String email){

        Users conflictingUser = userRepository.findByEmail(email);

        return conflictingUser == null;

    }

}
