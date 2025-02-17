import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int tutar = 0;
        int ücret = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mağazamıza hoşgeldiniz.");
        for (int i = 100; i > 0;i--)
        {
            System.out.println("Bir  seçim yapın \n1:Tavuk - 170TL/Kg\n2:Makarna - 15TL/Paket\n3:Isıtmalı Klozet - 3999TL\n0:Çıkış");
            switch (scanner.nextInt()){
                case 1:
                    tutar += 170;
                    break;
                case 2:
                    tutar += 15;
                    break;
                case 3:
                    tutar += 3999;
                    break;
                case 0:
                    i = 0;
            }
        }
        System.out.println("Tutar " + tutar + ", indirim kuponunuz var ise 1 e tıklayınız. Yok ise 0.");
        if (scanner.nextInt() == 1)
        {
            tutar -= tutar * 0.10;
        }
        System.out.println("Tutar:" + tutar + "\nÖdeme yapacağınız tutarı giriniz:");
        ücret = scanner.nextInt();
        if (ücret >= tutar)
        {
            System.out.println("Para üstünüz: " + (ücret - tutar) + "\nİyi günler dileriz.");
        }
        else
        {
            System.out.println("Lütfen yetkili biri ile görüşün.");
        }
    }
}