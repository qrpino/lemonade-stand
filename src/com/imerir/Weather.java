package com.imerir;

public enum Weather {

    HOT(40, 90), SUNNY(25, 60), CLOUDY(5, 20);

    private int pourcentageMin;
    private int pourcentageMax;

    private Weather(int min, int max) {
        this.pourcentageMin = min;
        this.pourcentageMax = max;
    }

    public int getPourcentageMin() {
        return this.pourcentageMin;
    }

    public int getPourcentageMax() {
        return this.pourcentageMax;
    }
}
