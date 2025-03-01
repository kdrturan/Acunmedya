import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,23,15,73,23,12,53,57));

        System.out.println("Listenin 4. indexindeki eleman : " + numbers.get(4));
        numbers.set(4,123);
        System.out.println("Güncellemeden sonra listenin 4. indexindeki eleman : " + numbers.get(4));
        System.out.println("Listenin boyutu: " + numbers.size());
        numbers.remove(4);
        System.out.println("Remove methodundan sonra listenin boyutu: " + numbers.size());
        System.out.println("Listenin 4. indexindeki eleman : " + numbers.get(4));
        numbers.clear();
        System.out.println("Listenin boyutu: " + numbers.size());
    }
}