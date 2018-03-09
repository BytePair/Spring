package main.java.coachdemo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "30 mins of batting cages";
    }

    @Override
    public String getDailyFortune() {
        return "Good luck";
    }

}
