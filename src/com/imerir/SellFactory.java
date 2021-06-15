package com.imerir;

public class SellFactory {
    // What is a high or low price
    final public double highestPrice = 1;
    final public double mediumPrice = 0.4;
    final public double lowestPrice = 0.1;

    // Variables that defines chances of selling lemonade per weather
    final public double stormyHigh = 0;
    final public double stormyMedium = 0.15;
    final public double stormyLow = 0.25;

    final public double cloudyHigh = 0.5;
    final public double cloudyMedium = 0.45;
    final public double cloudyLow = 0.65;

    final public double sunnyHigh = 0.25;
    final public double sunnyMedium = 0.65;
    final public double sunnyLow = 0.80;

    final public double veryHotHigh = 0.80;
    final public double veryHotMedium = 1;
    final public double veryHotLow = 1;

    final public double adPrice = 0.15;

    int lemonadeQuantity;
    int adsQuantity;
    double lemonadePrice;
    // Describes the chances of sale which depends on the weather and the lemonade price
    double sellFactor;
    int lemonadesSold;
    Player currentPlayer;

    double lemonadeProduction;
    double adsProduction;

    double trueBenefits;
    double actualMoney;

    public SellFactory(int lemonadeQuantity, int adsQuantity, double lemonadePrice, Weather weather, Player player){
        this.lemonadeQuantity = lemonadeQuantity;
        this.adsQuantity = adsQuantity;
        this.lemonadePrice = lemonadePrice;
        this.currentPlayer = player;
        // Big switch to process our sale factor
        switch (weather) {
            case SUNNY:
                if (this.lemonadePrice >= this.highestPrice) {
                    this.sellFactor = sunnyHigh;
                } else if (this.lemonadePrice >= this.mediumPrice) {
                    this.sellFactor = sunnyMedium;
                } else {
                    this.sellFactor = sunnyLow;
                }
                break;
            case VERY_HOT:
                if (this.lemonadePrice >= this.highestPrice) {
                    this.sellFactor = veryHotHigh;
                } else if (this.lemonadePrice >= this.mediumPrice) {
                    this.sellFactor = veryHotMedium;
                } else {
                    this.sellFactor = veryHotLow;
                }
                break;
            case CLOUDY:
                if (this.lemonadePrice >= this.highestPrice) {
                    this.sellFactor = cloudyHigh;
                } else if (this.lemonadePrice >= this.mediumPrice) {
                    this.sellFactor = cloudyMedium;
                } else {
                    this.sellFactor = cloudyLow;
                }
                break;
            case STORMY:
                if (this.lemonadePrice >= this.highestPrice) {
                    this.sellFactor = stormyHigh;
                } else if (this.lemonadePrice >= this.mediumPrice) {
                    this.sellFactor = stormyMedium;
                } else {
                    this.sellFactor = stormyLow;
                }
                break;
            default:
                break;
        }

        if(this.sellFactor * (1 + (this.adPrice * this.adsQuantity)) < 1){
            this.sellFactor = this.adPrice * this.adsQuantity;
        }
        else
        {
            this.sellFactor = 1;
        }
    }

    // Processes money and output values
    public void factory(double lemonadeProductionCost){
        // Substract production cost
        this.currentPlayer.setMoney(-(lemonadeProductionCost * this.lemonadeQuantity));
        System.out.println("LEMONADE PRODUCTION :" + -(lemonadeProductionCost * this.lemonadeQuantity));
        lemonadeProduction = -(lemonadeProductionCost * this.lemonadeQuantity);
        // Substract ads cost
        this.currentPlayer.setMoney(-(this.adsQuantity * this.adPrice));
        System.out.println("ADS PRODUCTION :" + -(this.adsQuantity * this.adPrice));
        adsProduction = -(this.adsQuantity * this.adPrice);
        // Number of lemonades sold
        this.lemonadesSold = (int)(this.lemonadeQuantity * (this.sellFactor));
        System.out.println("LEMONADES SOLD :" + (int)(this.sellFactor * this.lemonadeQuantity));
        // Add lemonades sales from lemonade
        this.currentPlayer.setMoney(this.lemonadesSold * this.lemonadePrice);
        System.out.println();
        trueBenefits = (this.lemonadesSold * this.lemonadePrice) - (lemonadeProductionCost * this.lemonadeQuantity)
                - (this.adsQuantity * this.adPrice);
        actualMoney = this.currentPlayer.getMoney();
        System.out.println("TRUE BENEFITS : " + this.trueBenefits);
        System.out.println("ACTUAL MONEY :" + this.currentPlayer.getMoney());

    }

    public double getLemonadeProduction() {
        return lemonadeProduction;
    }

    public double getAdsProduction() {
        return adsProduction;
    }

    public double getTrueBenefits() {
        return this.trueBenefits;
    }

    public int getLemonadesSold() {return this.lemonadesSold;};

    public double getActualMoney() {
        return actualMoney;
    }
}
