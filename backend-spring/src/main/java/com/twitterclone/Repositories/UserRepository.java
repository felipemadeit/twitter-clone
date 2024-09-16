package com.twitterclone.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitterclone.Entities.User;


// JpaRepository (Entity, PK)
public interface UserRepository extends JpaRepository<User, Long> {

}
