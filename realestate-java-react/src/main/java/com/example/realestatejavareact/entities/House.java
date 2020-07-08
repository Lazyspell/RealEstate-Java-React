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

    public House(String street_number, String street_name, City city, County county, double house_price, int sqft_per_a, int year_built, int view, int private_pool, int attic, int basement, int bed, int bath) {
        this.street_number = street_number;
        this.street_name = street_name;
        this.city = city;
        this.county = county;
        this.house_price = house_price;
        this.sqft_per_a = sqft_per_a;
        this.year_built = year_built;
        this.view = view;
        this.private_pool = private_pool;
        this.attic = attic;
        this.basement = basement;
        this.bed = bed;
        this.bath = bath;
    }

    public House(int house_id, String street_number, String street_name, City city, County county, double house_price, int sqft_per_a, int year_built, int view, int private_pool, int attic, int basement, int bed, int bath) {
        this.house_id = house_id;
        this.street_number = street_number;
        this.street_name = street_name;
        this.city = city;
        this.county = county;
        this.house_price = house_price;
        this.sqft_per_a = sqft_per_a;
        this.year_built = year_built;
        this.view = view;
        this.private_pool = private_pool;
        this.attic = attic;
        this.basement = basement;
        this.bed = bed;
        this.bath = bath;
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public double getHouse_price() {
        return house_price;
    }

    public void setHouse_price(double house_price) {
        this.house_price = house_price;
    }

    public int getSqft_per_a() {
        return sqft_per_a;
    }

    public void setSqft_per_a(int sqft_per_a) {
        this.sqft_per_a = sqft_per_a;
    }

    public int getYear_built() {
        return year_built;
    }

    public void setYear_built(int year_built) {
        this.year_built = year_built;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getPrivate_pool() {
        return private_pool;
    }

    public void setPrivate_pool(int private_pool) {
        this.private_pool = private_pool;
    }

    public int getAttic() {
        return attic;
    }

    public void setAttic(int attic) {
        this.attic = attic;
    }

    public int getBasement() {
        return basement;
    }

    public void setBasement(int basement) {
        this.basement = basement;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return house_id == house.house_id &&
                Double.compare(house.house_price, house_price) == 0 &&
                sqft_per_a == house.sqft_per_a &&
                year_built == house.year_built &&
                view == house.view &&
                private_pool == house.private_pool &&
                attic == house.attic &&
                basement == house.basement &&
                bed == house.bed &&
                bath == house.bath &&
                Objects.equals(street_number, house.street_number) &&
                Objects.equals(street_name, house.street_name) &&
                Objects.equals(city, house.city) &&
                Objects.equals(county, house.county);
    }

    @Override
    public int hashCode() {
        return Objects.hash(house_id, street_number, street_name, city, county, house_price, sqft_per_a, year_built, view, private_pool, attic, basement, bed, bath);
    }

    @Override
    public String toString() {
        return "House{" +
                "house_id=" + house_id +
                ", street_number='" + street_number + '\'' +
                ", street_name='" + street_name + '\'' +
                ", city=" + city +
                ", county=" + county +
                ", house_price=" + house_price +
                ", sqft_per_a=" + sqft_per_a +
                ", year_built=" + year_built +
                ", view=" + view +
                ", private_pool=" + private_pool +
                ", attic=" + attic +
                ", basement=" + basement +
                ", bed=" + bed +
                ", bath=" + bath +
                '}';
    }
}
