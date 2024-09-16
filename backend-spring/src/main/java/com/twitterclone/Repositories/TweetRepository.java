package com.twitterclone.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitterclone.Entities.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    
}
