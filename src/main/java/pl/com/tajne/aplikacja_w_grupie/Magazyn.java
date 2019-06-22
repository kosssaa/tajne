package pl.com.tajne.aplikacja_w_grupie;

import java.util.HashMap;

public class Magazyn {

    HashMap<Produkt, Integer> mapaProduktow = new HashMap<Produkt, Integer>();
    HashMap<String, Produkt> mapaZamowien = new HashMap<String, Produkt>();

    @Override
    public String toString() {
        return "Magazyn{" +
                "mapaProduktow=" + mapaProduktow +
                ", mapaZamowien=" + mapaZamowien +
                '}';
    }
}
