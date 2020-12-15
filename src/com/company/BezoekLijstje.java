package com.company;

public class BezoekLijstje {
    private Kind[] kinderen;

    public BezoekLijstje() {
        kinderen = new Kind[5];
        kinderen[0] = new Kind("Jaap", true, "Auto");
        kinderen[1] = new Kind("Noot", false, "Pop");
        kinderen[2] = new Kind("Mies", true, "Brandweerwagen");
        kinderen[3] = new Kind("Kees", false, "Viool");
        kinderen[4] = new Kind("Klaas", false, "Speelgoedpistool");
    }

    public Kind[] getKinderen() {
        return kinderen;
    }
}
