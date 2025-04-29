package oop.lab;

/**
 * Premium platinum credit card with reduced interest rate
 */
public class PlatinumCard extends CreditCard {
    
    public PlatinumCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }
    
    /**
     * Returns the premium platinum card interest rate
     * @return 10.0% interest rate (lower than standard)
     */
    @Override
    public double getInterestRate() {
        return 10.0; // 10% interest rate for platinum cards (lower than standard)
    }
}
