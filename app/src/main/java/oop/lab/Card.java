package oop.lab;

public class Card {
    private String cardNumber;
    private String cardHolder;
    
    public Card(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }
    
    public double getInterestRate() {
        return 0.0; // Default interest rate
    }
    
    public String getCardNumber() {
        return cardNumber;
    }
    
    public String getCardHolder() {
        return cardHolder;
    }
}
