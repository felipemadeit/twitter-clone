package com.twitterclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitterclone.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {


}
