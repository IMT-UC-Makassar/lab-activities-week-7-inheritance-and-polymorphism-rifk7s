package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {
    private static final double INTEREST_RATE = 0.02; // 2% interest
    private String loanStatus;
    
    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.loanStatus = "None";
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
    
    @Override
    public void applyForLoan(double amount) {
        // Process loan application
        loanStatus = "Pending";
    }
    
    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }
}
