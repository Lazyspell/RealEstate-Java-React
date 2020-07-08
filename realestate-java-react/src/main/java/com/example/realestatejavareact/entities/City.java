package com.example.realestatejavareact.entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "city")
public class City {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;

    @Column(nullable = false)
    private String city_name;

    @Column(nullable = false)
    private double city_housing_cost;

    @Column(nullable = false)
    private int city_rank;

    public City(){

    }

    public City(String city_name, double city_housing_cost, int city_rank) {
        this.city_name = city_name;
        this.city_housing_cost = city_housing_cost;
        this.city_rank = city_rank;
    }

    public City(int city_id, String city_name, double city_housing_cost, int city_rank) {
        this.city_id = city_id;
        this.city_name = city_name;
        this.city_housing_cost = city_housing_cost;
        this.city_rank = city_rank;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public double getCity_housing_cost() {
        return city_housing_cost;
    }

    public void setCity_housing_cost(double city_housing_cost) {
        this.city_housing_cost = city_housing_cost;
    }

    public int getCity_rank() {
        return city_rank;
    }

    public void setCity_rank(int city_rank) {
        this.city_rank = city_rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return city_id == city.city_id &&
                Double.compare(city.city_housing_cost, city_housing_cost) == 0 &&
                city_rank == city.city_rank &&
                Objects.equals(city_name, city.city_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city_id, city_name, city_housing_cost, city_rank);
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city_name='" + city_name + '\'' +
                ", city_housing_cost=" + city_housing_cost +
                ", city_rank=" + city_rank +
                '}';
    }
}
