import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Bir sayı girin: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        double average = sum / 10.0;
        System.out.println("Ortalama: " + average);
        System.out.print("50'den büyük sayılar: ");
        for (int num : numbers) {
            if (num > 50)
                System.out.print(num + " ");
        }
    }
}