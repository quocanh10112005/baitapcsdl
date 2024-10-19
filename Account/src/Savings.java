// Lớp con Savings
public class Savings extends Account {
    protected double intRate;
    protected double intAmount;

    public Savings(String acct_id, double balance, double intRate) {
        super(acct_id, balance);
        this.intRate = intRate;
        this.intAmount = 0;
    }

    public double calculateInterest() {
        return balance * intRate;
    }

    public void addInterestToBalance() {
        double interest = calculateInterest();
        balance += interest;
        intAmount = interest;
    }

    public double getInterestAmount() {
        return intAmount;
    }

    public double getIntRate() {
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }
}
