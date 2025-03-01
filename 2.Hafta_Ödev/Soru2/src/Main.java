import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 3, 1, 5, 8};

        Set<Integer> processedNum = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : numbers) {
            if (!processedNum.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Tekrar eden sayılar: " + duplicates);
    }
}