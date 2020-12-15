package com.company;

public class JuteZak {
    private String[] deZakVanJoulupukki;

    private int speeltjesInZak;

    public JuteZak() {
        deZakVanJoulupukki = new String[5];
        speeltjesInZak = 0;
    }

    public void stopEenSpeeltjeInDeZak(String speeltje) {
        deZakVanJoulupukki[speeltjesInZak] = speeltje;
        speeltjesInZak++;
    }
}
