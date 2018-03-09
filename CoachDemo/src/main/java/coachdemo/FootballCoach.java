package main.java.coachdemo;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public FootballCoach(FortuneService fortuneService) {
        System.out.println(this.getClass().getSimpleName() + ": Inside the Football Coach constructor");
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "5 minutes up downs";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    // the init method
    public void doStartUpStuff() {
        System.out.println("Inside doStartUpStuff()");
    }

    // the destroy method
    public void doCleanUpStuff() {
        System.out.println("Inside doCleanUpStuff()");
    }

}
