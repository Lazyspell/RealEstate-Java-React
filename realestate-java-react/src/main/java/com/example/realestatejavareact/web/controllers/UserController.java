package com.example.realestatejavareact.web.controllers;


import com.example.realestatejavareact.entities.Users;
import com.example.realestatejavareact.services.UserService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Users> getAllUsers(HttpServletRequest req){

        return userService.findAll();

    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Users register(@RequestBody Users newUser){
        return userService.register(newUser);
    }

}
