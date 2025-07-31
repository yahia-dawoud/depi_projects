package as6;

public class testa6 {
    public static void main(String[] args) {
        Product laptop = new Product("brrrr1", "Laptop", 700, 10);
        Customer customer = new Customer("grrr1", "ay7aga", "ay7aga@yay.com");
        Admin admin = new Admin("zrrr1", "tantawy", "tantawy@yay.com");

        customer.placeOrder(laptop, 2);
        admin.updateProduct(laptop, "Laptop", 500, 8);

        System.out.println("Updated price: $" + laptop.getPrice());
        System.out.println("Updated stock: " + laptop.getStock());
    }
}
