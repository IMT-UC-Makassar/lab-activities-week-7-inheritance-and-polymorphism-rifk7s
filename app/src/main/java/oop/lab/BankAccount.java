package oop.lab;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Jumlah setoran harus positif");
        }
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Jumlah penarikan harus positif");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Dana tidak mencukupi");
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
    
    // Each account type must implement its own interest calculation
    public abstract void calculateInterest();
}
