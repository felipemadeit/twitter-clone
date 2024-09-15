package com.twitterclone.model;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "tweets")
public class Tweet {

    // Attribute for the entity tweets
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    // ID for the tweet PK
    private Long tweetId;

    // Text context of the tweet
    @Column(nullable = false, length = 300)
    private String tweetContent;
    
    // Date of the tweet
    @Column (nullable = false, updatable = false)
    private LocalDateTime tweetCreatedAt;


    @ManyToOne
    @JoinColumn(name = "UserId", nullable = false) // FK is user_id
    // Tweet owner
    private User TweetUser;

    
    // Like count for the likes
    @Column (nullable = false)
    private int likesCount = 0;


    @Column (nullable = false)
    private int retweetCount = 0;

    
    
}
