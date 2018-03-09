package hello;


import org.joda.time.LocalTime;


public class HelloWorld {

  public static void main(String[] args) {

    System.out.println("***** Start of Hello World *****\n");

    LocalTime localTime = new LocalTime();
    System.out.println("The current local time is: " + localTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());

  }

}