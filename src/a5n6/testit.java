package a5n6;

public class testit {
    public static void main(String[] args) {
        Customer customer = new Customer("Yahia", "test@ejust.edu.eg", "nasr city");
        Admin admin = new Admin("haya", "haya@gmail.com", "Softwaretesting");

        System.out.println(customer.getUserDetails());
        System.out.println(admin.getUserDetails());

        customer.placeOrder("0001");
        customer.placeOrder("0001", 3);

        Payment creditCard = new CreditCardPayment();
        Payment payPal = new PayPalPayment();

        creditCard.processPayment(100.50);
        payPal.processPayment(75.25);

        System.out.println("Credit card valid: " + creditCard.validateCard("1234567890123456"));
        System.out.println("PayPal valid: " + payPal.validateCard("1234"));
    }
}
