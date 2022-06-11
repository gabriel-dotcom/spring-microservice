package com.springdemo;

public class BaseballCoach implements Coach {
    // In this example we will inject dependency using a constructor injection

    // define a private field for the dependency
    private FortuneService fortuneService;

    public BaseballCoach() {

    }

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
