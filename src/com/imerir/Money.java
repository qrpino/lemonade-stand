package com.imerir;

public class Money {

    private double money = 0;
    private double adsCost = 0.15;
    private double limonadeCost = 0.02;

    public Money(double money) {
        this.money = money;

    }

    public void payAds(int nunAds) {
        money -= nunAds * adsCost;
    }

    public void payLemonade(int numLemonde) {
        money -= numLemonde * limonadeCost;
    }

    public void winMoney(double win) {
        money += win;
    }

    public double getMoney() {
        return money;
    }

}
