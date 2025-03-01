import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {23, 42, 15, 1, 142, 64, 63, 12, 21};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 64));

        int[] subNum = Arrays.copyOfRange(numbers, 3, 5);
        System.out.println(Arrays.toString(subNum));

        System.out.println("Eşit mi: " + Arrays.equals(numbers, subNum));

        Arrays.fill(numbers, 2, 4, 7);
        System.out.println(Arrays.toString(numbers));
    }
}