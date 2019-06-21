package pl.com.tajne.aplikacja_w_grupie;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj komendę:");
        String komenda = scanner.nextLine();
        switch (komenda) {
            case "dodaj zamowienie":
                System.out.println("Podaj ilość produktów");
                int iloscProduktowTotal = scanner.nextInt();
                for (int i = 0; i < iloscProduktowTotal; i++) {
                    System.out.println("Podaj nazwę produktu " + (i + 1));
                    String nazwaProduktu = scanner.next();
                    System.out.println("Podaj cenę produktu " + (i + 1));
                    Double cenaProduktu = scanner.nextDouble();
                    System.out.println("Podaj ilość produktu " + (i + 1));
                    int iloscProduktu = scanner.nextInt();

                    //TODO dodanie produktu to Mapy(?)
                    Produkt produkt = new Produkt(nazwaProduktu, cenaProduktu, iloscProduktu, false);
                    HashMap<Produkt, Integer> produkties = new HashMap<>();
                    produkties.put(produkt, ++i);

                }
                String numerZamowienia = "GD" + random.ints(1, (300 + 1)).findFirst().getAsInt();

                System.out.println("Zamówienie zostało złożone. Numer zamówienia" + numerZamowienia);
                break;

            case "dodaj dostawe":
                System.out.println("Podaj numer zamówienia");
                String zamowienieDoDodania = scanner.nextLine();

                //TODO wylistowanie zamówienia z mapy
                for (int i = 0; i < i; i++) {
                    System.out.println("Czy w zamówieniu znajduje się produkt: ");

                    String odpowiedz = scanner.nextLine();
                    if (odpowiedz.equalsIgnoreCase("nie")){
                        System.out.println("Oznaczam produktu jako niedostarczony, nie zwiększam stanu magazynowego.");
                    }
                    System.out.println("Zamówienie zrelizowane, podaj numer faktury: ");
                    String NumerFaktury = scanner.nextLine();
                    System.out.println("Faktura dopisana do zamówienia.");
                    System.out.println("Czy chcesz wprowadzić datę ręcznie ?");
                    String Odpowiedz = scanner.nextLine();
                    if (odpowiedz.equalsIgnoreCase("nie")){

                    }
                }


                break;
            case "listuj zamowienia":
                break;
            case "listuj dostawy":
                break;
            case "listuj produkty":
                break;
            case "zapisz":
                break;
            case "wczytaj":
                break;
            case "sprzedaj":
                break;
        }
    }
}