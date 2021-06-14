package com.imerir;

import java.awt.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private Day day;
    private Lemonade lemonade;



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
        Bilan();
    }

    public void Bilan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of lemonade sold : " + lemonade.getNumLemonade());
        System.out.println("Number of Ads Create : " + lemonade.getNumAds());
        System.out.println("Cost of lemonade : " + lemonade.getCostLemonage());
        //TODO

        System.out.println("Continue (YES)");
        String nextday = scanner.nextLine();
        if(nextday.toString().equalsIgnoreCase("YES")) {
            Game();
        }
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

            }
        }

    }
}
