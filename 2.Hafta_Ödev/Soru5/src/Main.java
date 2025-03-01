import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Bir kelime girin: ");
            words.add(scanner.next());
        }
        Collections.sort(words);
        System.out.println("Alfabetik sıraya göre: " + words);
    }
}