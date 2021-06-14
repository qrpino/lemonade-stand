package com.imerir;

import java.util.Random;

public class Day {

    private int minRand = 1;
    private int maxRand = 10;
    private Weather weather;
    private int date;

    public enum Weather {
        HOT, SUNNY, CLOUDY
    }

    public Day() {
        date = 0;
        randWeather();
        System.out.println("Day : " + date + "Weather : " + weather);
    }

    public Day(int date) {
        this.date = date;
        randWeather();
        System.out.println("Day : " + date + "Weather : " + weather);

    }

    public void nextDay() {
        date += 1;
        new Day(date);
    }

    public void randWeather () {
        Random random = new Random();
        int randNum = random.nextInt(maxRand - minRand) + minRand;

        if(randNum <= 4 && randNum >= 1) {
            weather = Weather.CLOUDY;
        } else if (randNum <= 7 && randNum >= 5){
            weather = Weather.SUNNY;
        } else if (randNum <= 11 && randNum >= 8) {
            weather = Weather.HOT;
        }
    }

}
