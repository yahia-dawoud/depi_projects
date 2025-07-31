package a5n6;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getUserDetails() {
        return "Name: " + name + ", Email: " + email;
    }
}
