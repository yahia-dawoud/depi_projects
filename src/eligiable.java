import java.util.Scanner;

public class eligiable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age = input.nextInt();
        System.out.println("Please enter your nationality : ");
        String nationality = input.next();
        if((age >= 18) & (nationality.equalsIgnoreCase("egyptian"))){
            System.out.println("eligible to vote ");
        }else{
            System.out.println("Not eligible");
        }
    }
}
