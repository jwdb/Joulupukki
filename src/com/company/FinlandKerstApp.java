package com.company;

public class FinlandKerstApp {

    public static void main(String[] args) {
	BezoekLijstje lijstje = new BezoekLijstje();

	Joulupukki joulupukki = new Joulupukki(lijstje);
	System.out.println("De joulupukki gaat op stap...");
	joulupukki.bezoekDeKinderen();
    System.out.println("De joulupukki is klaar en gaat weer weg");

    }
}
