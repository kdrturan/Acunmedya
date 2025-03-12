import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int hız = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hızınızı giriniz:");
        hız = scanner.nextInt();
        if (90 < hız && hız <= 110)
        {
            System.out.println("Cezanız 1000 TL");
        }
        else if (110 < hız && hız <= 130)
        {
            System.out.println("Cezanız 2000 TL");
        }
        else if(hız > 130)
        {
            System.out.println("Ehliyetinize el konulacak. Geçmiş olsun...");
        }
        else
        {
            System.out.println("Sorun yok yola devam.");
        }
    }
}