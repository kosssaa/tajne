package pl.com.tajne.aplikacja_w_grupie;

public class Produkt {
    String nazwa;
    double cena;
    int liczba;
    boolean czyDostarczamy;

    public Produkt(String nazwa, double cena, int liczba, boolean czyDostarczamy) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.liczba = liczba;
        this.czyDostarczamy = czyDostarczamy;
    }

    public Produkt() {
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public boolean isCzyDostarczamy() {
        return czyDostarczamy;
    }

    public void setCzyDostarczamy(boolean czyDostarczamy) {
        this.czyDostarczamy = czyDostarczamy;
    }
}
