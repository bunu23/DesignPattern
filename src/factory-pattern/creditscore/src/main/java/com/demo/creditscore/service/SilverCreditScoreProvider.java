package com.demo.creditscore.service;

public class SilverCreditScoreProvider implements ScoreService {
    @Override
    public int getScore() {
        return 730; // Mocked credit score from "Silver" provider
    }
}