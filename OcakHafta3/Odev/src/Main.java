import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Bir sayı girin: ");
        number = scanner.nextInt();
        if (number %2 == 0)
            System.out.println("Sayı Çift.");
        else
            System.out.println("Sayı tek.");

        if(number < 0)
            System.out.println("Sayı negatif");
        else if (number == 0) {
            System.out.println("Sayı = 0.");
        }
        else
            System.out.println("Sayı pozitif");

    }
}