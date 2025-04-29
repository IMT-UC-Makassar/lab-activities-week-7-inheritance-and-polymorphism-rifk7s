package oop.lab;

public class PlatinumCard extends CreditCard {
    
    public PlatinumCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }
    
    @Override
    public double getInterestRate() {
        return 10.0; // 10% interest rate for platinum cards (lower than standard)
    }
}
