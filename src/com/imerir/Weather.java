package com.imerir;

public enum Weather {

    HOT(0.60, 0.90), SUNNY(0.30, 0.60), CLOUDY(0.05, 0.20);

    private double pourcentageMin;
    private double pourcentageMax;

    /* fonction principal */
    private Weather(double min, double max) {
        this.pourcentageMin = min;
        this.pourcentageMax = max;
    }

    /* fonction permetant de retournée la valeur min de la météo */
    public double getPourcentageMin() {
        return this.pourcentageMin;
    }

    /* fonction permetant de retournée la valeur max de la météo */
    public double getPourcentageMax() {
        return this.pourcentageMax;
    }
}
