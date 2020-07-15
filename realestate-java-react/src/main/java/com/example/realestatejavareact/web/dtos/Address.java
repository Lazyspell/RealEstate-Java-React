package com.example.realestatejavareact.web.dtos;

import java.util.Objects;

public class Address {

    private String street_name;
    private String street_number;

    public Address() {
    }

    public Address(String street_name, String street_number) {
        this.street_name = street_name;
        this.street_number = street_number;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street_name, address.street_name) &&
                Objects.equals(street_number, address.street_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street_name, street_number);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street_name='" + street_name + '\'' +
                ", street_number='" + street_number + '\'' +
                '}';
    }
}
