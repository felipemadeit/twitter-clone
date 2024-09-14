package com.twitterclone.model;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.persistence.Column;


@Entity
@Table(name="users")
public class User {

    // Attributes for the user table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Id for the user
    private Long id;

    @Column(nullable = false, unique= true, length = 50)
    private String username;

    @Column(nullable = false, unique = true, lenght = 100)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(length= 300)
    private String profilePicture;

    @Column(length = 500)
    private String bio;

    @Column(nullable = false)
    private int followingCount;

    @Column(nullable = false)
    private int followersCount;

    // Getter and setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    

}
