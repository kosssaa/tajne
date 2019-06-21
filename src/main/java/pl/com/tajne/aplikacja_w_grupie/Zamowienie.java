package pl.com.tajne.aplikacja_w_grupie;

import java.util.HashMap;

public class Zamowienie {

    private double numer;
    private String dataZamowienia;
    private String dataDostarczenia;
    private String numerFaktury;


    HashMap<Produkt, Integer> produkties = new HashMap<>();


    public Zamowienie(double numer, String dataZamowienia, String dataDostarczenia, String numerFaktury) {
        this.numer = numer;
        this.dataZamowienia = dataZamowienia;
        this.dataDostarczenia = dataDostarczenia;
        this.numerFaktury = numerFaktury;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "numer=" + numer +
                ", dataZamowienia='" + dataZamowienia + '\'' +
                ", dataDostarczenia='" + dataDostarczenia + '\'' +
                ", numerFaktury='" + numerFaktury + '\'' +
                ", produkties=" + produkties +
                '}';
    }

    public double getNumer() {
        return numer;
    }

    public void setNumer(double numer) {
        this.numer = numer;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public String getDataDostarczenia() {
        return dataDostarczenia;
    }

    public void setDataDostarczenia(String dataDostarczenia) {
        this.dataDostarczenia = dataDostarczenia;
    }

    public String getNumerFaktury() {
        return numerFaktury;
    }

    public void setNumerFaktury(String numerFaktury) {
        this.numerFaktury = numerFaktury;
    }

    public HashMap<Produkt, Integer> getProdukties() {
        return produkties;
    }

    public void setProdukties(HashMap<Produkt, Integer> produkties) {
        this.produkties = produkties;
    }
}
