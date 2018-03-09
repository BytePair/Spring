package com.testing.demo.coaches;

import com.testing.demo.coaches.Coach;
import com.testing.demo.fortunes.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class FootballCoach implements Coach {

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Laps all day";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortune();
    }

}
