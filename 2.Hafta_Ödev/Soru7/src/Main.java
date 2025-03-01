import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("İstanbul", "Ankara", "İzmir", "Bursa", "Antalya"));
        System.out.print("Bir şehir adı girin: ");
        String city = scanner.next();
        boolean found = false;
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).equalsIgnoreCase(city)) {
                System.out.println(city + " bulundu, indeksi: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(city + " listede yok.");
        }

    }
}