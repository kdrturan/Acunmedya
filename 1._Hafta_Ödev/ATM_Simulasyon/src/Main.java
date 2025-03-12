import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int islem;
        int deneme = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Hesap oluşturmak için  adınızı giriniz:");
        String isim = scanner.nextLine();
        System.out.println("Hesap oluşturmak için şifrenizi giriniz:");
        String sifre = scanner.nextLine();
        Musteri musteri = new Musteri(isim,sifre);
        int choice = 0;


        System.out.println("Merhaba, " + musteri.getIsim() + " lütfen şifrenizi giriniz:");
        while (deneme > 0)
        {
            if (deneme != 3)
            {
                System.out.println("Şifre yanlış lütfen tekrar deneyin:");
            }
            sifre = scanner.nextLine();
            if (!sifre.equals(musteri.getSifre()))
            {
                deneme--;
                continue;
            }
            break;
        }
        if (deneme == 0)
        {
            System.out.println("\u001B[31m" + "Hesap bloke oldu" + "\u001B[0m");
            return;
        }
        System.out.println("Giriş başarılı");
        while (true)
        {
            System.out.println("Lütfen bir seçim yapın:\n" + "1.Bakiye Görüntüleme\n" + "2.Para Yatırma\n" + "3.Para Çekme\n" + "4.Çıkış\n");
            choice = scanner.nextInt();

            if (choice == 1)
            {
                System.out.println("Güncel bakiyeniz:" + musteri.getBakiye());
            }
            else if (choice == 2)
            {
                System.out.println("Yatırmak istediğiniz para miktarını giriniz:");
                islem = scanner.nextInt();
                musteri.setBakiye(musteri.getBakiye() + islem);
                System.out.println("Yeni bakiyeniz: " + musteri.getBakiye());
            }
            else if (choice == 3)
            {
                System.out.println("Çekmek istediğiniz para miktarını giriniz:");
                islem = scanner.nextInt();
                if (islem > musteri.getBakiye())
                {
                    System.out.println("Bakiye yetersiz.");
                    continue;
                }
                musteri.setBakiye(musteri.getBakiye() - islem);
                System.out.println("Yeni bakiyeniz: " + musteri.getBakiye());
            }
            else if (choice == 4)
            {
                break;
            }
            else
            {
                System.out.println("Yanlış giriş yaptınız.");
            }
        }
        return;
    }
}
