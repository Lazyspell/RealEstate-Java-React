package com.example.realestatejavareact.entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "house")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int house_id;

    @Column(nullable = false)
    private String street_number;

    @Column(nullable = false)
    private String street_name;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "county_id", nullable = false)
    private County county;

    @Column(nullable = false)
    private double house_price;

    @Column(nullable = false)
    private int sqft_per_a;

    @Column(nullable = false)
    private int year_built;

    @Column(nullable = false)
    private int view;

    @Column(nullable = false)
    private int private_pool;

    @Column(nullable = false)
    private int attic;

    @Column(nullable = false)
    private int basement;

    @Column(nullable = false)
    private int bed;

    @Column(nullable = false)
    private int bath;

    public House(){

    }




}
