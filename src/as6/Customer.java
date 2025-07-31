package as6;

public class Customer extends User{
    public Customer(String userId, String username, String email) {
        super(userId, username, email);
    }

    public void placeOrder(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            System.out.println("Order placed for " + quantity + " of " + product.getName());
        } else {
            System.out.println("Insufficient stock for " + product.getName());
        }
    }
}
