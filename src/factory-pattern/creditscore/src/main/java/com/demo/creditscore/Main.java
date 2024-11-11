package com.demo.creditscore;

import com.demo.creditscore.factory.ScoreServiceFactory;
import com.demo.creditscore.service.ScoreService;

public class Main {

    public static void main(String[] args) {
        // Fetch and display the score from each credit score provider
        ScoreService blueProvider = ScoreServiceFactory.getScoreService(ScoreServiceFactory.ProviderType.BLUE);
        System.out.println("Blue Credit Score Provider Score: " + blueProvider.getScore());

        ScoreService greenProvider = ScoreServiceFactory.getScoreService(ScoreServiceFactory.ProviderType.GREEN);
        System.out.println("Green Credit Score Provider Score: " + greenProvider.getScore());

        ScoreService silverProvider = ScoreServiceFactory.getScoreService(ScoreServiceFactory.ProviderType.SILVER);
        System.out.println("Silver Credit Score Provider Score: " + silverProvider.getScore());
    }
}