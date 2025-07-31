package a5n6;

public class Customer extends User{
    private String shippingAddress;

    public Customer(String name, String email, String shippingAddress) {
        super(name, email);
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails() + ", Shipping Address: " + shippingAddress;
    }

    public void placeOrder(String productId) {
        System.out.println("Order placed for product: " + productId);
    }

    public void placeOrder(String productId, int quantity) {
        System.out.println("Order placed for product: " + productId + ", Quantity: " + quantity);
    }
}
