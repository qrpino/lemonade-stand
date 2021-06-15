package com.imerir;

public class Player {
    private double money;
    public Player(int money){
        this.money = money;
    }
    public void setMoney(double money){
        this.money += money;
    }
    public double getMoney() {
        return money;
    }
}
