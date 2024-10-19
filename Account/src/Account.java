// Lớp cha Account
public class Account {
    public double balance;
    public String acct_id;

    public Account(String acct_id, double balance) {
        this.acct_id = acct_id;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
