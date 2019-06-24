package pl.com.tajne.rozne_zadania.czwarta4;

public class Zad1 {
    public int sum(int[] numbers){
        return numbers[0] + numbers[1];
    }


    public static void main(String[] args) {
        String[] daysOfTheWeek = new String[7];
        daysOfTheWeek[0] = "Monday";
        daysOfTheWeek[1] = "Tuesday";
        daysOfTheWeek[2] = "Wednesday";
        daysOfTheWeek[3] = "Thursday";
        daysOfTheWeek[4] = "Friday";
        daysOfTheWeek[5] = "Saturday";
        daysOfTheWeek[6] = "Sunday";

        Zad1 zad1 = new Zad1();
        int[] number = {1, 5};
        System.out.println(zad1.sum(number));



    }
}
