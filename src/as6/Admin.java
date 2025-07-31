package as6;

public class Admin extends User{
    public Admin(String userId, String username, String email) {
        super(userId, username, email);
    }

    public void updateProduct(Product product, String name, double price, int stock) {
        product.setPrice(price);
        product.setStock(stock);
        System.out.println("Product updated: " + name);
    }
}
