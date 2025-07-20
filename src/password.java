import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter password");
        String password = input.nextLine();
        int count = 0;
        int amount = 3;
        String newpass;
        do{
            System.out.println("please enter password you have " + (amount - count) + " left");
            newpass = input.nextLine();
        if(newpass.equals(password)){
            System.out.println("access granted");
            break;
        }else {
            count++;
            System.out.println("try again");
        }
        }while(amount > count);
    }
}
