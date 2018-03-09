package main.java.coachdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scopeApplicationContext.xml");

        // retrieve bean(s) from spring container
        Coach firstCoach = context.getBean("myCoach", Coach.class);
        Coach secondCoach = context.getBean("myCoach", Coach.class);

        // get memory locations
        System.out.println("Memory Location of #1: " + firstCoach);
        System.out.println("Memory Location of #2: " + secondCoach);

        // check if coaches are referring to the same object/bean
        System.out.println("\nSame object: " + (firstCoach == secondCoach));

        // close the context (clean up)
        context.close();

    }
}
