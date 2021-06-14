package com.imerir;

public enum Weather {

    HOT(40, 90), SUNNY(25, 60), CLOUDY(5, 20);

    private int[] pourcentage;

    private Weather(int min, int max) {
        pourcentage[0] = min;
        pourcentage[1]= max;
    }

    public int[] getValue() {
        return pourcentage;

    }
}
