package com.example.realestatejavareact.entities;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue
    private int invoice_id;

    @Column(nullable = false, unique = true)
    private String first_name;

    @Column(nullable = false, unique = true)
    private String last_name;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    public Users(){

    }

    public Users(int invoice_id, String first_name, String last_name, String username, String email, UserRole role) {
        this.invoice_id = invoice_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.email = email;
        this.role = role;
    }

    public Users(String first_name, String last_name, String username, String email, UserRole role) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.email = email;
        this.role = role;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return invoice_id == users.invoice_id &&
                Objects.equals(first_name, users.first_name) &&
                Objects.equals(last_name, users.last_name) &&
                Objects.equals(username, users.username) &&
                Objects.equals(email, users.email) &&
                role == users.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoice_id, first_name, last_name, username, email, role);
    }

    @Override
    public String toString() {
        return "Users{" +
                "invoice_id=" + invoice_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
