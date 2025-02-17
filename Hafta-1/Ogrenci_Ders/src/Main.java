import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();
        int toplam = 0;
        int not = 0;
        for (int i = 1;i <= 5; i++)
        {
            System.out.println(i +". dersin notunu giriniz: ");
            not = scanner.nextInt();
            sayilar.add(not);
            toplam += not;
            if (not < 30)
            {
                System.out.println("Düşük not aldığınız dersler var!");
            }
        }
        double ortalama = toplam/5.0;
        if (ortalama < 50)
        {
            System.out.println("Kaldınız.Ortalama:" + ortalama);
        }
        else
        {
            System.out.println("Geçtiniz.Ortalama:" + ortalama);
        }

        System.out.println("En yüksek puanınız: " + Collections.max(sayilar));
        System.out.println("En düşük puanınız: " + Collections.min(sayilar));
    }
}