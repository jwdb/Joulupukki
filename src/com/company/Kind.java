package com.company;

public class Kind {
    private String naam;
    private boolean stoutGeweest;
    private String speeltje;

    public Kind(String naam, boolean stoutGeweest, String speeltje) {
        this.naam = naam;
        this.stoutGeweest = stoutGeweest;
        this.speeltje = speeltje;
    }

    public boolean isStoutGeweest() {
        return stoutGeweest;
    }

    public String pakSpeeltjeAf() {
        String x = this.speeltje;
        this.speeltje = null;
        return x;
    }
}
