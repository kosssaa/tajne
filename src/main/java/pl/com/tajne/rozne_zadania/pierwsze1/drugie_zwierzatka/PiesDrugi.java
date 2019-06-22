package pl.com.tajne.rozne_zadania.pierwsze1.drugie_zwierzatka;

public class PiesDrugi {

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
        return "PiesDrugi{" +
                "kolor='" + kolor + '\'' +
                ", ileNog=" + ileNog +
                ", czyDziki=" + czyDziki +
                '}';
    }

    public PiesDrugi(String kolor, int ileNog, boolean czyDziki) {
        this.kolor = kolor;
        this.ileNog = ileNog;
        this.czyDziki = czyDziki;



    }
}
