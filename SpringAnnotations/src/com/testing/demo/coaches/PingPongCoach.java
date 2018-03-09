package com.testing.demo.coaches;

import com.testing.demo.coaches.Coach;
import com.testing.demo.fortunes.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class PingPongCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public PingPongCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Ping the pong";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }
}
