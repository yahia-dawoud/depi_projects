package a5n6;

public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
    @Override
    public boolean validateCard(String cardNumber) {
        return cardNumber.length() == 16;
    }
}