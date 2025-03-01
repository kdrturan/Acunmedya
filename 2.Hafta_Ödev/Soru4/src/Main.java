import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Bir sayı girin: ");
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers);
        System.out.print("Büyükten küçüğe sıralı: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }
}