package pl.com.tajne.rozne_zadania.pierwsze1;

import pl.com.tajne.rozne_zadania.pierwsze1.drugie_zwierzatka.MalpkaDrugi;
import pl.com.tajne.rozne_zadania.pierwsze1.drugie_zwierzatka.PiesDrugi;
import pl.com.tajne.rozne_zadania.pierwsze1.pierwsze_zwierzatka.KotPierwszy;
import pl.com.tajne.rozne_zadania.pierwsze1.pierwsze_zwierzatka.KrowaPierwsza;

public class Main {
    public static void main(String[] args) {

        KotPierwszy kotPierwszy = new KotPierwszy("Biały", 4, false);
        KrowaPierwsza krowaPierwsza = new KrowaPierwsza("Łaciata", 4, false);
        MalpkaDrugi malpkaDrugi = new MalpkaDrugi("Brązowa", 2, true);
        PiesDrugi piesDrugi = new PiesDrugi("Czarny", 4, false);



        System.out.println(kotPierwszy);
        System.out.println(krowaPierwsza);
        System.out.println(malpkaDrugi);
        System.out.println(piesDrugi);


    }
}
