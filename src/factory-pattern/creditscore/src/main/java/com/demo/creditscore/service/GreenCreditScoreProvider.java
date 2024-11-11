package com.demo.creditscore.service;

public class GreenCreditScoreProvider implements ScoreService {
    @Override
    public int getScore() {
        return 720; // Mocked credit score from "Green" provider
    }
}