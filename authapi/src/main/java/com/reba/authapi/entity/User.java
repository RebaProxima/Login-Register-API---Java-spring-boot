package com.reba.authapi.entity;

import jakarta.persistence.*;


@Entity//Marks the class as database entry
@Table(name = "users")
public class user{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String fullName;

    @Column(unique = true)
    private String email;

    private String password;

    public User() {
    }

    public User(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

}