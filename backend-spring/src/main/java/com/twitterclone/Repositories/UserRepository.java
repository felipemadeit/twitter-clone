package com.twitterclone.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitterclone.Entities.User;


// JpaRepository (Entity, PK)
public interface UserRepository extends JpaRepository<User, Long> {

    // Search methods
    // The optional is a class that handles situations where such a user does not exist, avoids the nullPointerException
    Optional<User> findByUserName(String username);
    Optional<User> findByEmail(String email);

}
