package com.demo.creditscore;

import com.demo.creditscore.factory.ScoreServiceFactory;
import com.demo.creditscore.service.ScoreService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreServiceFactoryTest {

    @Test
    public void testBlueCreditScoreProvider() {
        ScoreService service = ScoreServiceFactory.getScoreService(ScoreServiceFactory.ProviderType.BLUE);
        assertEquals(750, service.getScore(), "Blue provider should return a score of 750");
    }

    @Test
    public void testGreenCreditScoreProvider() {
        ScoreService service = ScoreServiceFactory.getScoreService(ScoreServiceFactory.ProviderType.GREEN);
        assertEquals(720, service.getScore(), "Green provider should return a score of 720");
    }

    @Test
    public void testSilverCreditScoreProvider() {
        ScoreService service = ScoreServiceFactory.getScoreService(ScoreServiceFactory.ProviderType.SILVER);
        assertEquals(730, service.getScore(), "Silver provider should return a score of 730");
    }
}