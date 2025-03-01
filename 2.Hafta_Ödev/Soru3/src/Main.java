// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {-1, 4, -43, 34, 12, -15, 52, 24, 86};

        int posSum = 0, negSum = 0;
        for (int num : numbers) {
            if (num >= 0) posSum += num;
            else negSum += num;
        }
        System.out.println("Pozitif toplam: " + posSum);
        System.out.println("Negatif toplam: " + negSum);
    }
}