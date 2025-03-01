import java.util.ArrayList;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int rnd = rand.nextInt(100);
            if (rnd % 2 == 0) evenNumbers.add(rnd);
        }
        System.out.println("Çift sayılar: " + evenNumbers);
    }
}