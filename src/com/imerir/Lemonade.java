package com.imerir;

public class Lemonade {

    private int numLemonade= 0;
    private int numAds = 0;
    private double costLemonage = 0;

    /* fonction principale permetant de crée les lemonade  */
    public Lemonade(int numLemonade, int numAds, double costLemonage) {
        this.numLemonade = numLemonade;
        this.numAds = numAds;
        this.costLemonage= costLemonage;
    }

    /* fonction permetant de retournée le nombre de lemonade a vendre */
    public int getNumLemonade() {
        return numLemonade;
    }

    /* fonction permetant de retournée le nombre d'annonce a fair */
    public int getNumAds() {
        return numAds;
    }

    /* fonction permetant de retournée le prix d'une lemonade */
    public double getCostLemonage() {
        return costLemonage;
    }
}
