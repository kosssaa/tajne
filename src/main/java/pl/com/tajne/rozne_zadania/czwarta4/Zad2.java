package pl.com.tajne.rozne_zadania.czwarta4;

public class Zad2 {
    public int biggest(int[] numbers) {
        int biggest = numbers[0];
        if (numbers[1] > biggest) {
            biggest = numbers[1];
        }
        if (numbers[2] > biggest) {
            biggest = numbers[2];
        }
        return biggest;
    }
    public int biggestWithoutIf(int[] numbers) {
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));

    }

    public static void main(String[] args) {

        Zad2 zad2 = new Zad2();
        int[] numbers = {3, 62, 22};
        System.out.println(zad2.biggestWithoutIf(numbers));
        System.out.println(zad2.biggest(numbers));
        System.out.println(Math.max(numbers[2], numbers[0]));


    }
}
