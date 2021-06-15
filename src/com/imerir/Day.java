package com.imerir;

public class Day {
    int id;
    double lemonadeProductionCost = 0.02;
    Weather weather;
    //TODO

    public Day(int id){
        // day id = current day (1, 2, 3, etc..)
        this.id = id;
        // Each 3 days, production cost increase by 2 cents
        if(this.id % 3 == 0){
            this.lemonadeProductionCost += 0.02;
        }
        // Weather initialization
        // Generates a random, Math.random generates a float between 0 and 1, and we multiply its value by 100
        int rand =  (int)(Math.random() * 100);
        // 10%
        if(rand > 90 && rand < 100){
            this.weather = Weather.STORMY;
        }
        // 15%
        else if(rand > 75 && rand < 90){
            this.weather = Weather.CLOUDY;
        }
        // 50%
        else if(rand > 25 && rand < 75){
            this.weather = Weather.SUNNY;
        }
        // 25%
        else{
            this.weather = Weather.VERY_HOT;
        }
    }

    @Override
    public String toString() {
        return "DAY " + this.id + ", WEATHER : " + this.weather.toString() + "\n" +
                "LEMONADE PRODUCTION COST IS " + this.lemonadeProductionCost;
    }

    public double getLemonadeProductionCost(){
        return this.lemonadeProductionCost;
    }

    public Weather getWeather() {
        return this.weather;
    }
}
