package com.imerir;

import java.util.Random;

public class Day {

    private int minRand = 1;
    private int maxRand = 10;
    private Weather weather;
    private int date;

    /* fonction permetant de crée le premier jour */
    public Day() {
        date = 0;
        randWeather();
        System.out.println("Day : " + date + ", Weather : " + weather);
    }

    /* fonction permetant de un jour X */
    public Day(int date) {
        this.date = date;
        randWeather();
        System.out.println("Day : " + date + ", Weather : " + weather);

    }

    /* fonction permetant de retournée la météo */
    public Weather getWeather() {
        return weather;
    }

    /* fonction permetant de passer au jour suivant */
    public void nextDay() {
        date += 1;
        new Day(date);
    }

    /* fonction permetant de generai aleatoirement la météo */
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
