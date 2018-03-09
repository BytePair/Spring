package com.testing.demo.fortunes;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] fortunes = {
            "Great fortune incoming",
            "Good fortune incoming",
            "Average fortune incoming",
            "Meh fortune incoming",
            "Bad fortune incoming"
    };

    @Override
    public String getFortune() {
        Random r = new Random();
        return fortunes[r.nextInt(this.fortunes.length)];
    }
}
