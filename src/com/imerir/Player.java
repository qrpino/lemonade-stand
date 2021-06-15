package com.imerir;

public class Player {
    private int money;
    public Player(int money){
        this.money = money;
    }
    public void setMoney(double money){
        this.money += money;
    }
    public int getMoney() {
        return money;
    }
}
