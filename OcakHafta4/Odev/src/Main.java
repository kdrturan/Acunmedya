import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Birsayı girin: ");
        number = scanner.nextInt();
        for (int i = 0; i < number;i++)
        {
            sum += i;
        }
        System.out.println("Sayıların toplamı : " + sum);
    }
}