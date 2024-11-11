package com.demo.creditscore.factory;

import com.demo.creditscore.service.BlueCreditScoreProvider;
import com.demo.creditscore.service.GreenCreditScoreProvider;
import com.demo.creditscore.service.ScoreService;
import com.demo.creditscore.service.SilverCreditScoreProvider;

public class ScoreServiceFactory {
    public enum ProviderType {
        BLUE,
        GREEN,
        SILVER
    }

    /**
     * Returns an instance of ScoreService based on the specified provider type.
     *
     * @param type the type of provider requested
     * @return an instance of a specific ScoreService implementation
     */
    public static ScoreService getScoreService(ProviderType type) {
        switch (type) {
            case BLUE:
                return new BlueCreditScoreProvider();
            case GREEN:
                return new GreenCreditScoreProvider();
            case SILVER:
                return new SilverCreditScoreProvider();
            default:
                throw new IllegalArgumentException("Unknown provider type: " + type);
        }
    }
}

