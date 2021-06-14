package com.imerir;

import java.util.Random;

public class Client {

    private int nbClient;
    private Lemonade lemonade;
    private float ratioClient;
    private float ratioReel;

    /* fonction principale , creation d'un nb de client selon les contraintes */
    public void createClient(Weather weather, Lemonade lemonade) {

        Random random = new Random();
        double randNum = weather.getPourcentageMin() + (weather.getPourcentageMax() - weather.getPourcentageMin()) * random.nextDouble();
        Double client = new Double(randNum * 40);

        System.out.println(client);

        nbClient = client.intValue();
        ratioClient = nbClient / 5;
        if (ratioClient > lemonade.getNumAds()) {
            ratioReel = lemonade.getNumAds() / ratioClient;
            nbClient *= ratioReel;
            System.out.println("a" + nbClient);
        }

        System.out.println(nbClient);

        if(nbClient > lemonade.getNumLemonade()) {
            nbClient = lemonade.getNumLemonade();
            System.out.println("b" + nbClient);

        }
    }

    /* fonction permetant de retournée le nb de client */
    public int getNbClient() {
        return nbClient;
    }
}
