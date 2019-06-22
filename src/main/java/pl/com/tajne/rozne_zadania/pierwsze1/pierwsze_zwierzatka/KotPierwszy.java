package pl.com.tajne.rozne_zadania.pierwsze1.pierwsze_zwierzatka;

public class KotPierwszy {

    private String kolor;
    private int ileNog;
    private boolean czyDziki;

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getIleNog() {
        return ileNog;
    }

    public void setIleNog(int ileNog) {
        this.ileNog = ileNog;
    }

    public boolean isCzyDziki() {
        return czyDziki;
    }

    public void setCzyDziki(boolean czyDziki) {
        this.czyDziki = czyDziki;
    }

    @Override
    public String toString() {
        return "KotPierwszy{" +
                "kolor='" + kolor + '\'' +
                ", ileNog=" + ileNog +
                ", czyDziki=" + czyDziki +
                '}';
    }

    public KotPierwszy(String kolor, int ileNog, boolean czyDziki) {
        this.kolor = kolor;
        this.ileNog = ileNog;
        this.czyDziki = czyDziki;

    }
}
