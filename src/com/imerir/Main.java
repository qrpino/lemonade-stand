package com.imerir;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private Day day;
    private Lemonade lemonade;
    private Money money;
    private Client client = new Client();




    public static void main(String[] args) {

        new Main().start();

    }

    void start() {
        StartOrNo();
    }

    public void StartOrNo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("START ? (YES OR NO)");

        String next = scanner.nextLine();

        if (next.toString().equalsIgnoreCase("YES")) {
            day = new Day();
            money = new Money(2);
            Questions();
            Game();
        }
    }

    public void Questions() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many lemonade did you want to make ?");
        int numLemonade = scanner.nextInt();

        System.out.println("How many ads did you want to make ?");
        int numAds = scanner.nextInt();

        System.out.println("How many wanted to sell a penny lemonade ?");
        int costLemonade = scanner.nextInt();

        lemonade = new Lemonade(numLemonade, numAds, costLemonade);
        client.createClient(day.getWeather(), lemonade);
        Bilan();
    }

    public void Bilan() {
        Scanner scanner = new Scanner(System.in);

        money.payAds(lemonade.getNumAds());
        money.payLemonade(lemonade.getNumLemonade());
        money.winMoney(client.getNbClient() * lemonade.getCostLemonage());

        System.out.println("Number of clients : " + client.getNbClient());
        System.out.println("Number of lemonade sold : " + lemonade.getNumLemonade());
        System.out.println("Number of Ads Create : " + lemonade.getNumAds());
        System.out.println("Cost of lemonade : " + lemonade.getCostLemonage());
        //TODO
        System.out.println("Lemonade SOlD PAY : (Lemonade : " + lemonade.getNumLemonade() * 0.02 + "), (Ads : " + lemonade.getNumAds() * 0.15 + ")");
        System.out.println("Lemonade SOlD WIN : " + client.getNbClient() * lemonade.getCostLemonage());
        System.out.println("ALL MONEY : " + money.getMoney());

        Game();
    }

    public void Game() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NEXT DAY ? (YES OR NO)");

        String next = scanner.nextLine();
        while(!(next.toString().equalsIgnoreCase("STOP"))) {
            if (next.toString().equalsIgnoreCase("YES")) {
                day.nextDay();
                next = null;
                Questions();

            } else {
                Game();
            }
        } System.exit();
    }
}
