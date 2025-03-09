public class CheckingAccount extends BankAccount{
    public CheckingAccount(int id, String accountHolder, int balance) {
        super(id, accountHolder, balance);
    }

    @Override
    public double CalculateInterest() {
        System.out.println("Checking accounts do not earn interest." );
         return (0);
    }
}
