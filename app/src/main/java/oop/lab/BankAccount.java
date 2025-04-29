package oop.lab;

/**
 * Abstract base class for all bank account types
 * Provides core banking functionality and enforces account-specific interest calculation
 */
public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    /**
     * Deposits money into the account
     * @param amount the amount to deposit
     * @throws IllegalArgumentException if amount is negative or zero
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }
    
    /**
     * Withdraws money from the account
     * @param amount the amount to withdraw
     * @throws IllegalArgumentException if amount is negative, zero, or exceeds balance
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    protected void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    /**
     * Calculates and applies interest to the account balance
     * Each account type implements its own interest calculation logic
     */
    public abstract void calculateInterest();
}
