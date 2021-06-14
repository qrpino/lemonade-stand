package com.imerir;

public enum Weather {

    HOT(40, 90), SUNNY(25, 60), CLOUDY(5, 20);

    private int [] pourcentage;

    private Weather(int min, int max) {
        int [] pourcentage = {min, max};
    }

    public int[] getPourcentage() {
        return pourcentage;

    }
}
