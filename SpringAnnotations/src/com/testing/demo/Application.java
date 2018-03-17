package com.testing.demo;

import com.testing.demo.coaches.Coach;
import com.testing.demo.coaches.PingPongCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        PingPongCoach ppCoach = context.getBean("pingPongCoach", PingPongCoach.class);
        Coach footballCoach = context.getBean("footballCoach", Coach.class);

        // call methods on tennis coach bean
        System.out.println("\nTennis:");
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getFortune());

        // call methods on ping pong coach bean
        System.out.println("\nPingPong:");
        System.out.println(ppCoach.getDailyWorkout());
        System.out.println(ppCoach.getFortune());

        // call methods on football coach bean
        System.out.println("\n\nFootball:");
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getFortune());

        // close the context
        context.close();

    }

}
