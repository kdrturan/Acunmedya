public class SavingsAccount extends BankAccount{
    public SavingsAccount(int id, String accountHolder, int balance) {
        super(id, accountHolder, balance);
    }

    @Override
    public double CalculateInterest() {
        return (this.getBalance() * 0.05 );
    }

}
