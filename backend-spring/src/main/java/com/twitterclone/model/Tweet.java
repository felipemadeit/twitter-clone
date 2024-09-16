package com.twitterclone.model;

import java.time.LocalDateTime;

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

    // Attributes for the entity tweets
    
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

    // FK to the tweet owner
    @ManyToOne
    @JoinColumn(name = "UserId", nullable = false) // FK is user_id
    // Tweet owner
    private User tweetUser;

    
    // Like count for the likes
    @Column (nullable = false)
    private int likesCount = 0;


    @Column (nullable = false)
    private int retweetCount = 0;

    @ManyToOne
    @JoinColumn(name= "retweeted_tweet_id", nullable = false)
    private Tweet retweetedTweet;

    public Long getTweetId() {
        return tweetId;
    }

    public void setTweetId(Long tweetId) {
        this.tweetId = tweetId;
    }

    public String getTweetContent() {
        return tweetContent;
    }

    public void setTweetContent(String tweetContent) {
        this.tweetContent = tweetContent;
    }

    public LocalDateTime getTweetCreatedAt() {
        return tweetCreatedAt;
    }

    public void setTweetCreatedAt(LocalDateTime tweetCreatedAt) {
        this.tweetCreatedAt = tweetCreatedAt;
    }

    public User getTweetUser() {
        return tweetUser;
    }

    public void setTweetUser(User tweetUser) {
        this.tweetUser = tweetUser;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(int retweetCount) {
        this.retweetCount = retweetCount;
    }

    public Tweet getRetweetedTweet() {
        return retweetedTweet;
    }

    public void setRetweetedTweet(Tweet retweetedTweet) {
        this.retweetedTweet = retweetedTweet;
    }
}
