package oop.lab;

/**
 * Business account with interest accumulation, online services, and loan capabilities
 */
public class BusinessAccount extends BankAccount implements OnlineService, LoanService {
    private static final double INTEREST_RATE = 0.02; // 2% interest
    private String loanStatus;
    
    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.loanStatus = "None";
    }
    
    /**
     * Calculates and applies 2% interest to the account balance
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
    
    /**
     * Applies for a loan of the specified amount
     * @param amount loan amount requested
     */
    @Override
    public void applyForLoan(double amount) {
        // Process loan application
        loanStatus = "Pending";
    }
    
    /**
     * Returns the current status of the loan application
     * @return current loan status
     */
    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }
}
