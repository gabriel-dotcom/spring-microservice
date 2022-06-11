package com.springdemo;

public class TrackCoach implements Coach {
    // In this example we will inject dependency using a constructor injection

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    // Creating a Bean lifeCycle

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackerCoach: inside method doMyStartupStuff");
    }

    // add a destroy method
    public void doMyCleanupStuffYoYo() {
        System.out.println("TrackerCoach: inside method doMyCleanupStuff");
    }
}
