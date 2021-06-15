package com.imerir;

import java.util.Scanner;

public class Game {
    //* Lemonade const prices that defines what price is high and which is low
    final double highPrice = 1;
    final double mediumPrice = 0.4;
    final double lowPrice = 0.2;

    private Day currentDay;
    int dayId = 1;
    private SellFactory sellFactory;
    private Player currentPlayer = new Player(2);

    public void generateDay() {
        day();
    }

    public void loop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("START? (YES OR NO)");
        String next = scanner.nextLine();
        while(!next.toString().equalsIgnoreCase("NO")){
            if(next.toString().equalsIgnoreCase("YES")){
                questions();
            }
        }
        System.exit(-1);
    }

    public SellFactory getSellFactory() {
        return sellFactory;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean isGameOver(){
        if(this.currentPlayer.getMoney() < this.currentDay.getLemonadeProductionCost())
        {
            return true;
        }
        return false;
    }


    public void questions(){
        day();
        this.dayId += 1;
        System.out.println(currentDay.toString());
        if(!this.isGameOver())
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("HOW MANY LEMONADE DO YOU WANT TO PRODUCE ?");
            int nbLemonade = scanner.nextInt();
            while(nbLemonade * this.currentDay.getLemonadeProductionCost() > this.currentPlayer.getMoney())
            {
                System.out.println("NOT ENOUGH MONEY");
                System.out.println("HOW MANY LEMONADE DO YOU WANT TO PRODUCE ?");
                nbLemonade = scanner.nextInt();
            }


            System.out.println("HOW MANY ADS DO YOU WANT TO MAKE ?");
            int nbAds = scanner.nextInt();
            while(nbAds * 0.15 > this.currentPlayer.getMoney() - (nbLemonade * this.currentDay.getLemonadeProductionCost())){
                System.out.println("NOT ENOUGH MONEY");
                System.out.println("HOW MANY ADS DO YOU WANT TO MAKE ?");
                nbAds = scanner.nextInt();
            }


            System.out.println("HOW MUCH DO YOU SELL LEMONADE ?");
            double lemonadeSellPrice = scanner.nextDouble();

            sellFactory = new SellFactory(nbLemonade, nbAds, lemonadeSellPrice, currentDay.getWeather(), this.currentPlayer);
            sellFactory.factory(currentDay.getLemonadeProductionCost());
        }
        else{
            System.out.println("Game over");
            System.exit(-1);
        }

    }

    public void day() {
        this.currentDay = new Day(this.dayId);
    }

    public Day getCurrentDay() {
        return currentDay;
    }

    public void questionGui(int nbLemonade, int nbAds, double lemonadeSellPrice) {
        day();
        this.dayId += 1;
        // We divide lemonade sell price by 100 because we are using a slider that doesn't accept double/float values
        sellFactory = new SellFactory(nbLemonade, nbAds, lemonadeSellPrice/100, currentDay.getWeather(), this.currentPlayer);
        sellFactory.factory(currentDay.getLemonadeProductionCost());
    }
}
