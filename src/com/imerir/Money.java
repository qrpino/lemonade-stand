package com.imerir;

public class Money {

    private double money = 0;
    private double adsCost = 0.15;
    private double lemonadeProductionCost = 0.02;

    public Money(double money) {
        this.money = money;

    }

    public void payAds(int nbAds) {
        money -= (nbAds * adsCost);
    }

    public void payLemonade(int numLemonde) {
        money -= numLemonde * lemonadeProductionCost;
    }

    public void winMoney(double win) {
        money += win;
    }

    public double getMoney() {
        return money;
    }

    public double getLemonadeProductionCost(){
        return this.lemonadeProductionCost;
    }
    public double getAdsCost(){
        return this.adsCost;
    }
}
