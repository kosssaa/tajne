package pl.com.tajne.aplikacja_w_grupie;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
@Data
@AllArgsConstructor

public class Zamowienie {

    private double numer;
    private List<Produkt> produkts;
    private String dataZamowienia;
    private String dataDostarczenia;
    private String numerFaktury;


    HashMap<Produkt, Integer> produkty = new HashMap<>();


}
