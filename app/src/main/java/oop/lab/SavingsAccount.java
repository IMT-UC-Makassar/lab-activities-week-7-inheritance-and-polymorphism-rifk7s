package oop.lab;

/**
 * Savings account with interest accumulation capabilities
 */
public class SavingsAccount extends BankAccount implements OnlineService {
    private static final double INTEREST_RATE = 0.05; // 5% interest
    
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    
    /**
     * Calculates and applies 5% interest to the account balance
     */
    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
    }
    
    /**
     * Transfers funds to another account
     * @param amount amount to transfer
     * @param destinationAccount destination account number
     */
    @Override
    public void transferFunds(double amount, String destinationAccount) {
        withdraw(amount);
        // Let's say we would transfer to the destination account
    }
    
    /**
     * Pays bills from this account
     * @param amount amount to pay
     */
    @Override
    public void payBills(double amount) {
        withdraw(amount);
        // Let's say we would process the bill payment
    }
}
