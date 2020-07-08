package com.example.realestatejavareact.entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "county")
public class County {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int county_id;

    @Column(nullable = false)
    private String county_name;

    @Column(nullable = false)
    private String county_rank;

    @Column(nullable = false)
    private double county_housing_cost;

    public County(){

    }

}


