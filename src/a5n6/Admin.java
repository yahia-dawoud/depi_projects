package a5n6;

public class Admin extends User{
    private String department;

    public Admin(String name, String email, String department) {
        super(name, email);
        this.department = department;
    }

    @Override
    public String getUserDetails() {
        return super.getUserDetails() + ", Department: " + department;
    }
}
