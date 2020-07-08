package com.example.realestatejavareact.entities;


import javax.persistence.*;

@Entity
@Table(name= "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int state_id;

    @Column(nullable = false)
    private String state_initial;

}
