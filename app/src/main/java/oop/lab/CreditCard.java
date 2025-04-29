package oop.lab;

/**
 * Standard credit card with 15% interest rate
 */
public class CreditCard extends Card {
    
    public CreditCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }
    
    /**
     * Returns the standard credit card interest rate
     * @return 15.0% interest rate
     */
    @Override
    public double getInterestRate() {
        return 15.0; // 15% interest rate for standard credit cards
    }
}
