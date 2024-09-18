package com.twitterclone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.twitterclone.Repositories.UserRepository;

// The service contains the logic of the business, in this class the app verifies if the username or the email is already registered, and encrypt the password

public class UserService {

    // The following Autowired variables is for dependency injection

    @Autowired
    // This dependency injection id for inject the userRepository, it is because to use the data in the db remember that the repository allows the communication

    // The service needs to interact with the database through the repository. Injecting this dependency allows the service to access the persistence layer methods without having to manually create instances.
    private UserRepository userRepository;

    @Autowired
    // BCrypt to protect the password
    private PasswordEncoder passwordEncoder;

}
