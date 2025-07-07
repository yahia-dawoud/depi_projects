//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("enter the first number : ");
        double num1 = input.nextDouble();
        System.out.println("enter the second number : ");
        double num2 = input.nextDouble();
        System.out.println("The sum : "+ ( num1 + num2));
        System.out.println("the difference : " + (num1 - num2));
        System.out.println("the product : " + (num1 * num2));
        System.out.println("the quotient : " + (num1 / num2));

        }
    }
