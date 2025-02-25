package com.Demo.Demo2.entity;


import jakarta.persistence.Column;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
@Table(name="leads")
@Entity
public class Lead {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    @Column(name="first_name",nullable=false,length=45)
    private String firstName;
    @Column(name="last_name",nullable=false,length=45)
    private String lastName;
    @Column(name="email",nullable=false,length=128,unique = true)
    private String email;

    @Column(name="mobile",nullable=false,length=45,unique = true)
    private long mobile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}