package oop.lab;

/**
 * Checking account with no interest but supports online services
 */
public class CheckingAccount extends BankAccount implements OnlineService {
    
    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    
    /**
     * Checking accounts earn no interest
     */
    @Override
    public void calculateInterest() {
        // Checking accounts have no interest
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
