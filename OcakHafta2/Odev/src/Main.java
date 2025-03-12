import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Bir sayı girin: ");
        number1 = scanner.nextInt();
        System.out.print("Bir sayı girin: ");
        number2 = scanner.nextInt();
        System.out.println("Sayıların Toplamı:" + (number1 + number2));


    }
}