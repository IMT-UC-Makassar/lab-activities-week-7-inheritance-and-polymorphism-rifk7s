package oop.lab;

/**
 * Debit card linked to a bank account with no interest
 */
public class DebitCard extends Card {
    
    public DebitCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }
    
    /**
     * Debit cards have no interest
     * @return 0.0 as interest rate
     */
    @Override
    public double getInterestRate() {
        return 0.0; // Debit cards have no interest
    }
}
