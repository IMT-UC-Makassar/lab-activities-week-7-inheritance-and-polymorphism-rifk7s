package oop.lab;

/**
 * Base class for all types of banking cards
 */
public class Card {
    private String cardNumber;
    private String cardHolder;
    
    public Card(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }
    
    /**
     * Returns the interest rate associated with this card type
     * @return interest rate as a percentage
     */
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
