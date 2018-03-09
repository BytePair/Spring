package com.testing.demo.coaches;

import com.testing.demo.coaches.Coach;
import com.testing.demo.fortunes.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// register the bean and give id to the TennisCoach bean
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    @Autowired
    @Qualifier("sadFortuneService")  // used when there are multiple interface implementations
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
