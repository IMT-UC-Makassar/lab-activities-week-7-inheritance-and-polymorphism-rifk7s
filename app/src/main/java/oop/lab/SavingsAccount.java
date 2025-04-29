package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    private static final double INTEREST_RATE = 0.05; // 5% interest
    
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    
    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
    }
    
    @Override
    public void transferFunds(double amount, String destinationAccount) {
        withdraw(amount);
        // Let's say we would transfer to the destination account
    }
    
    @Override
    public void payBills(double amount) {
        withdraw(amount);
        // Let's say we would process the bill payment
    }
}
