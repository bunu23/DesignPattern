package com.demo.creditscore.service;

public  interface  ScoreService {
    /**
     * Fetches the credit score from a specific provider.
     *
     * @return an integer representing the credit score
     */
    int getScore();
}
