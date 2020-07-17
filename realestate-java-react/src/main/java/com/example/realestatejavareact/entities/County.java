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
    private int county_rank;

    @Column(nullable = false)
    private double county_housing_cost;

    public County(){

    }

    public County(String county_name, int county_rank, double county_housing_cost) {
        this.county_name = county_name;
        this.county_rank = county_rank;
        this.county_housing_cost = county_housing_cost;
    }

    public County(int county_id, String county_name, int county_rank, double county_housing_cost) {
        this.county_id = county_id;
        this.county_name = county_name;
        this.county_rank = county_rank;
        this.county_housing_cost = county_housing_cost;
    }

    public int getCounty_id() {
        return county_id;
    }

    public void setCounty_id(int county_id) {
        this.county_id = county_id;
    }

    public String getCounty_name() {
        return county_name;
    }

    public void setCounty_name(String county_name) {
        this.county_name = county_name;
    }

    public int getCounty_rank() {
        return county_rank;
    }

    public void setCounty_rank(int county_rank) {
        this.county_rank = county_rank;
    }

    public double getCounty_housing_cost() {
        return county_housing_cost;
    }

    public void setCounty_housing_cost(double county_housing_cost) {
        this.county_housing_cost = county_housing_cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        County county = (County) o;
        return county_id == county.county_id &&
                Double.compare(county.county_housing_cost, county_housing_cost) == 0 &&
                Objects.equals(county_name, county.county_name) &&
                Objects.equals(county_rank, county.county_rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(county_id, county_name, county_rank, county_housing_cost);
    }

    @Override
    public String toString() {
        return "County{" +
                "county_id=" + county_id +
                ", county_name='" + county_name + '\'' +
                ", county_rank='" + county_rank + '\'' +
                ", county_housing_cost=" + county_housing_cost +
                '}';
    }
}


