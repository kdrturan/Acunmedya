public abstract class BankAccount {
    private int id;
    private String accountHolder;
    private int balance;

    public BankAccount(int id,String accountHolder,int balance)
    {
        this.id = id;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public abstract double CalculateInterest();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}