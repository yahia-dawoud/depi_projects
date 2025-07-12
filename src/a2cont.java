import java.util.Scanner;

public class a2cont {
    public static void main(String[] args) {

        System.out.println("Numbers 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("********************");


        System.out.println("Even/Odd Check:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
        System.out.println("********************");
        System.out.print("enter number to display day of the week : ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println("****************************");
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 1; j <= 10 ; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("-------------------------------");
        }
        System.out.print("Enter a number to count digits: ");
        int number = input.nextInt();
        int cnt = 0;
        int temp = number;

        if (temp == 0) {
            cnt = 1;
        } else {
            while (temp != 0) {
                temp /= 10;
                cnt++;
            }
        }
        System.out.println("Number of digits in " + number + ": " + cnt);
        System.out.print("Enter a number to reverse: ");
        number = input.nextInt();
        int reversed = 0;
        temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

}

