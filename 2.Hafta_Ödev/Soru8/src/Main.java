import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++)
        {
            numbers.add(random.nextInt(1000));
        }
        System.out.println("En küçük: " + Collections.min(numbers));
        System.out.println("En büyük: " + Collections.max(numbers));
    }
}