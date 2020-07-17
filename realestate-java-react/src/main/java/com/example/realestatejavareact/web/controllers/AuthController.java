package com.example.realestatejavareact.web.controllers;

import com.example.realestatejavareact.services.UserService;
import com.example.realestatejavareact.web.dtos.Credentials;
import com.example.realestatejavareact.web.dtos.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Principal login(@RequestBody Credentials credentials){
        return userService.login(credentials);
    }

}
