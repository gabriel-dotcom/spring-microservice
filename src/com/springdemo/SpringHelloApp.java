package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    // In this example we will inject dependency using a constructor injection

    public static void main(String[] args) {
        // Loading the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from spring container
        // myCoach = Bean Id.
        // Coach.class = Interface
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // Call methods on the Bean
        System.out.println(theCoach.getDailyWorkout());

        // Lets call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
