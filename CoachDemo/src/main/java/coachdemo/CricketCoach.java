package main.java.coachdemo;

public class CricketCoach implements Coach {

    // variables
    private String emailAddress;
    private String team;

    // services
    private FortuneService fortuneService;

    // no arg constructor
    public CricketCoach() {
        System.out.println("Inside of the default CricketCoach constructor");
    }

    // setter methods that will be used by the setter injection defined in the applicationContext.xml
    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside of setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Inside of setTeam");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside of setFortuneService");
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Whatever cricket players do...";
    }

    @Override
    public String getDailyFortune() {
        return "Crickey! " + this.fortuneService.getFortune();
    }
}
