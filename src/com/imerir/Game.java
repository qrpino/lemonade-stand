package com.imerir;

import java.util.Scanner;

public class Game {
    private Day currentDay;
    int dayId = 1;
    private SellFactory sellFactory;
    private Player currentPlayer = new Player(2);

    public void loop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("START? (YES OR NO)");
        String next = scanner.nextLine();
        while(!next.toString().equalsIgnoreCase("NO")){
            if(next.toString().equalsIgnoreCase("YES")){
                    this.questions();
            }
        }
        System.exit(-1);
    }

    // Check if we still can produce one lemonade
    public boolean isGameOver(){
        if(this.currentPlayer.getMoney() < this.currentDay.getLemonadeProductionCost())
        {
            return true;
        }
        return false;
    }

    public void questions(){
        this.currentDay = new Day(this.dayId);
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
            System.out.println("GAME OVER");
            System.exit(-1);
        }
    }
}
