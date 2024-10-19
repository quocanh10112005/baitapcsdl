// Lớp con OverdraftAccount
public class OverdraftAccount extends Account {
    private double odLimit;
    private double overdraft;
    private double availableBalance;

    public OverdraftAccount(String acct_id, double balance, double odLimit) {
        super(acct_id, balance);
        this.odLimit = odLimit;
        this.overdraft = 0;
        this.availableBalance = balance;
    }

    public double getODLimit() {
        return odLimit;
    }

    public void setODLimit(double odLimit) {
        this.odLimit = odLimit;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= availableBalance + odLimit) {
            if (amount > availableBalance) {
                overdraft = amount - availableBalance;
                availableBalance = 0;
            } else {
                availableBalance -= amount;
            }
            return true;
        }
        return false;
    }
}
