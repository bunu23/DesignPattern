package com.demo.creditscore.service;

public class BlueCreditScoreProvider implements ScoreService {
    @Override
    public int getScore() {
        return 750;
    }
}