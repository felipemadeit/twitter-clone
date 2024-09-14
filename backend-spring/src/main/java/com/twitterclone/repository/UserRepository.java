package com.twitterclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitterclone.model.User;


// JpaRepository (Entity, PK)
public interface UserRepository extends JpaRepository<User, Long> {

}
