import java.util.Scanner;

public class iseven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if even or odd
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

    }
}
