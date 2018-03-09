package main.java.coachdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        // 2. create a spring container (load the spring configuration file)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 3. retrieve bean from spring container (bean id, interface)
        Coach myCoach = context.getBean("myCoach", Coach.class);

        // 4. call methods on the bean
        System.out.println("Default: " + myCoach.getDailyWorkout());

        // Test constructor injection
        Coach footballCoach = context.getBean("footballCoach", Coach.class);
        System.out.println("Football: " + footballCoach.getDailyWorkout());
        System.out.println(footballCoach.getDailyFortune());

        // Test setter injection
        Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
        System.out.println("Cricket: " + cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        // 5. clean up - close the context
        context.close();
    }
}
