package com.imerir;

import java.util.Random;

public class Client {

    private int nbClient;
    private Lemonade lemonade;
    private float ratioClient;
    private float ratioReel;

    public void createClient(Weather weather, Lemonade lemonade) {

        Random random = new Random();
        double randNum = weather.getPourcentageMin() + (weather.getPourcentageMax() - weather.getPourcentageMin()) * random.nextDouble();
        Double client = new Double(randNum * 40);

        nbClient = client.intValue();
        ratioClient = nbClient / 5;
        if (ratioClient > lemonade.getNumAds()) {
            ratioReel = lemonade.getNumAds() / ratioClient;
            nbClient *= ratioReel;
        }

        if(nbClient > lemonade.getNumLemonade()) {
            nbClient = lemonade.getNumLemonade();
            }
        }
    }

    public int getNbClient() {
        return nbClient;
    }
}
