package com.springdemo;

public class MyApp {

    public static void main(String[] args) {
        Coach baseballCoach = new BaseballCoach();
        Coach runnerCoach = new TrackCoach();

        // Refactoring
        // Aqui nós temos uma interface para coach que tem um metodo podemos usar para esportes diferentes assim
        // o metodo terá outputs diferentes de acordo com o esporte
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(runnerCoach.getDailyWorkout());
    }
}
