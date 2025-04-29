package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {
    
    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    
    @Override
    public void calculateInterest() {
        // Checking accounts have no interest
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
