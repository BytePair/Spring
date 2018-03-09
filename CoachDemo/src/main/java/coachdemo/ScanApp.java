package main.java.coachdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScanApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("componentScanningContext.xml");
        TennisCoach tCoach = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println("Tennis Coach: " + tCoach.getDailyWorkout());
    }
}
