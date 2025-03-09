// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1,"Kadir",60000,"IT",30);
        Developer developer = new Developer(2,"Tuncay",40000,"IT","Java");

        System.out.println("Manager bonusu: " + manager.CalculateBonus());
        System.out.println("Developer bonusu: " + developer.CalculateBonus());

    }
}