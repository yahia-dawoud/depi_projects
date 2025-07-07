import java.util.Scanner;
public class upper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a sentence : ");
        String sent = input.nextLine();
        System.out.println(sent.toUpperCase());
        System.out.println("the lenght : " + sent.length());
        System.out.println("First character : " + sent.charAt(0));
    }
}
