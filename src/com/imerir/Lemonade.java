package com.imerir;

public class Lemonade {

    private int numLemonade= 0;
    private int numAds = 0;
    private int lemonadeCost = 0;

    public Lemonade(int numLemonade, int numAds, int lemonadeCost) {
        this.numLemonade = numLemonade;
        this.numAds = numAds;
        this.lemonadeCost = lemonadeCost;
    }

    public int getNumLemonade() {
        return numLemonade;
    }

    public int getNumAds() {
        return numAds;
    }

    public int getLemonadeCost() {
        return lemonadeCost;
    }
}
