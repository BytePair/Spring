package main.java.coachdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

    private String[] fortunes = {
            "Today is your lucky day",
            "Today is your unlucky day",
            "Today is a day"
    };

    @Override
    public String getFortune() {
        Random r = new Random();
        return fortunes[r.nextInt(3)];
    }
}
