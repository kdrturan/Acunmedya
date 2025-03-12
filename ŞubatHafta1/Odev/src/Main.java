import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int max;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i+1) +". Sayıyı  girin: ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + "  ");
        }

        System.out.println();
        max = numbers[0];
        for (int i = 1;i < numbers.length - 1; i++)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
        }
        System.out.println("Dizidki en büyük sayı: " + max);

    }
}