package main.java.coachdemo;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "30 Minutes HIIT training";
    }

    @Override
    public String getDailyFortune() {
        return "Good luck";
    }
}
