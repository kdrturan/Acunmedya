
public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1,"Kadir",40000);
        BankAccount checkingAccount = new CheckingAccount(2,"Gamze",60000);

        System.out.println("SavingsAccount Interests for "+ savingsAccount.getAccountHolder() + ": " + savingsAccount.CalculateInterest());
        checkingAccount.CalculateInterest();
    }
}