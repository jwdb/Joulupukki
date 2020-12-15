package com.company;

import java.io.Console;

public class Joulupukki {
    private JuteZak deZakVanJoulupukki;
    private BezoekLijstje bezoekLijstje;
    private int aantalSpeeltjesInDeZak;
    private String joulipukkiSays;
    private String JoulipukkiSaysTranslated;

    public Joulupukki(BezoekLijstje bezoekLijstje) {
        this.bezoekLijstje = bezoekLijstje;
        aantalSpeeltjesInDeZak = 0;
        deZakVanJoulupukki = new JuteZak();
    }

    public void bezoekDeKinderen() {
        for (Kind kind:bezoekLijstje.getKinderen()) {
            if (kind.isStoutGeweest()) {
                String speeltje = kind.pakSpeeltjeAf();
                System.out.println("Oei het kind was stout! We pakken "+ speeltje + " Af!");
                deZakVanJoulupukki.stopEenSpeeltjeInDeZak(speeltje);
            }
        }
    }

    public void watZegtJoulupukki() {

    }
}
