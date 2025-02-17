import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim = -1;
        int tutar = 0;
        do
        {
            System.out.println("Lütfen seçim yapın:\n1:Kremalı Mantarlı Makarna 250TL\n2:Sezar Salata 185TL\n3:Gavurdağı Salatası 190TL\n4:Yayık Ayran 60TL\n5:Sütlaç 100TL\n0:Sonlandır.");
            secim = scanner.nextInt();
            switch (secim)
            {
                case 1:
                    tutar += 250;
                    break;
                case 2:
                    tutar += 185;
                    break;
                case 3:
                    tutar += 190;
                    break;
                case 4:
                    tutar += 60;
                    break;
                case 5:
                    tutar += 100;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız.");
            }
        }while (secim != 0);

        System.out.println("Toplam hesap:" +tutar);
    }
}