package main.java.coachdemo;


import org.springframework.stereotype.Component;


// register Spring bean and give it a BeanID
@Component("tennisCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Work on backhand";
    }

    @Override
    public String getDailyFortune() {
        return "Test Fortune";
    }
}
