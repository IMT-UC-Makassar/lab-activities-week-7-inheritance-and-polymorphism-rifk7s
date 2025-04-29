package oop.lab;

/**
 * Interface for accounts that provide online banking services
 */
public interface OnlineService {
    /**
     * Transfers funds to another account
     * @param amount amount to transfer
     * @param destinationAccount recipient account number
     */
    void transferFunds(double amount, String destinationAccount);
    
    /**
     * Pays bills from this account
     * @param amount amount to pay
     */
    void payBills(double amount);
}
