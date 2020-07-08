package com.example.realestatejavareact.web.dtos;

import com.example.realestatejavareact.entities.City;
import com.example.realestatejavareact.entities.County;
import com.example.realestatejavareact.entities.House;

import java.util.Objects;

public class HouseDTO {

    private int house_id;
    private int attic;
    private int basement;
    private int bath;
    private int bed;
    private double house_price;
    private int private_pool;
    private int sqft_per_a;
    private String street_name;
    private String street_number;
    private int view;
    private int year_built;
    private String city;
    private String county;

    public HouseDTO(){
        super();
    }

    public HouseDTO(House house){
        this.house_id = house.getHouse_id();
        this.attic = house.getAttic();
        this.basement = house.getBasement();
        this.bath = house.getBath();
        this.bed = house.getBed();
        this.house_price = house.getHouse_price();
        this.private_pool = house.getPrivate_pool();
        this.sqft_per_a = house.getSqft_per_a();
        this.street_name = house.getStreet_name();
        this.street_number = house.getStreet_number();
        this.view = house.getView();
        this.year_built = house.getYear_built();
        this.city = house.getCity().getCity_name();
        this.county = house.getCounty().getCounty_name();
    }

    public int getHouse_id() {
        return house_id;
    }

    public void setHouse_id(int house_id) {
        this.house_id = house_id;
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

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public double getHouse_price() {
        return house_price;
    }

    public void setHouse_price(double house_price) {
        this.house_price = house_price;
    }

    public int getPrivate_pool() {
        return private_pool;
    }

    public void setPrivate_pool(int private_pool) {
        this.private_pool = private_pool;
    }

    public int getSqft_per_a() {
        return sqft_per_a;
    }

    public void setSqft_per_a(int sqft_per_a) {
        this.sqft_per_a = sqft_per_a;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getYear_built() {
        return year_built;
    }

    public void setYear_built(int year_built) {
        this.year_built = year_built;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseDTO houseDTO = (HouseDTO) o;
        return house_id == houseDTO.house_id &&
                attic == houseDTO.attic &&
                basement == houseDTO.basement &&
                bath == houseDTO.bath &&
                bed == houseDTO.bed &&
                Double.compare(houseDTO.house_price, house_price) == 0 &&
                private_pool == houseDTO.private_pool &&
                sqft_per_a == houseDTO.sqft_per_a &&
                view == houseDTO.view &&
                year_built == houseDTO.year_built &&
                Objects.equals(street_name, houseDTO.street_name) &&
                Objects.equals(street_number, houseDTO.street_number) &&
                Objects.equals(city, houseDTO.city) &&
                Objects.equals(county, houseDTO.county);
    }

    @Override
    public int hashCode() {
        return Objects.hash(house_id, attic, basement, bath, bed, house_price, private_pool, sqft_per_a, street_name, street_number, view, year_built, city, county);
    }

    @Override
    public String toString() {
        return "HouseDTO{" +
                "house_id=" + house_id +
                ", attic=" + attic +
                ", basement=" + basement +
                ", bath=" + bath +
                ", bed=" + bed +
                ", house_price=" + house_price +
                ", private_pool=" + private_pool +
                ", sqft_per_a=" + sqft_per_a +
                ", street_name='" + street_name + '\'' +
                ", street_number='" + street_number + '\'' +
                ", view=" + view +
                ", year_built=" + year_built +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
