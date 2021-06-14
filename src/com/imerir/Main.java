package com.imerir;

import java.util.Scanner;

public class Main {

    private Day day;
    private Lemonade lemonade;
    private Money money;


    /* main debut programme java */
    public static void main(String[] args) {

        new Main().start();

    }

    /* lancement du jeux */
    void start() {
        StartOrNo();
    }

    /* debut  de la partie */
    public void StartOrNo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("START ? (YES OR STOP)");

        String next = scanner.nextLine();
        while(!(next.toString().equalsIgnoreCase("STOP"))) {
            if (next.toString().equalsIgnoreCase("YES")) {
                day = new Day();
                money = new Money(2);
                Questions();
                Game();
            }
        } System.exit(-1);
    }


    /* fonction créeation de lemonade */
    public void Questions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You currently have " + this.money.getMoney() + " amount of money.");
        System.out.println("Price of lemonade production is : " + this.money.getLemonadeProductionCost());
        System.out.println("How many lemonades do you want to make ?");
        System.out.println("(Price of lemonade production * desired amount of lemonades)");
        int numLemonade = scanner.nextInt();

        System.out.println("How many ads do you want to make ?");
        int numAds = scanner.nextInt();

        System.out.println("How much will you sell lemonade (price in cents)?");
        int costLemonade = scanner.nextInt();
        lemonade = new Lemonade(numLemonade, numAds, costLemonade);
        Bilan();
    }

    /* fonction d'affichage du recapitulatif */
    public void Bilan() {
        Scanner scanner = new Scanner(System.in);

        money.payAds(lemonade.getNumAds());
        money.payLemonade(lemonade.getNumLemonade());

        System.out.println("Number of lemonades sold : " + lemonade.getNumLemonade());
        System.out.println("Number of ads created : " + lemonade.getNumAds());
        System.out.println("Cost of lemonade : " + lemonade.getLemonadeCost());
        //TODO
        System.out.println("Lemonades SOlD : " );
        System.out.println("Money win : " + money.getMoney());

        System.out.println("Continue (YES)");
        String nextDay = scanner.nextLine();
        if(nextDay.toString().equalsIgnoreCase("YES")) {
            Game();
        }
    }

    /* fonction pricipale du jeu */
    public void Game() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NEXT DAY ? (YES OR STOP)");

        String next = scanner.nextLine();
        while(!(next.toString().equalsIgnoreCase("STOP"))) {
            if (next.toString().equalsIgnoreCase("YES")) {
                day.nextDay();
                next = null;
                Questions();

            }
        }
    }
}
