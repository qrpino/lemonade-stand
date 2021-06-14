package com.imerir;

public class Lemonade {

    private int numLemonade= 0;
    private int numAds = 0;
    private int costLemonage = 0;

    public Lemonade(int numLemonade, int numAds, int costLemonage) {
        this.numLemonade = numLemonade;
        this.numAds = numAds;
        this.costLemonage= costLemonage;
    }

    public int getNumLemonade() {
        return numLemonade;
    }

    public int getNumAds() {
        return numAds;
    }

    public int getCostLemonage() {
        return costLemonage;
    }
}
