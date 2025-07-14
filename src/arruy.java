import java.util.Scanner;

public class arruy {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("please enter the number of students : ");
        int studentnum = input.nextInt();
        int [] marks = new int [studentnum];
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i =0 ; i < studentnum ; i++){
            System.out.print(" Please enter the mark of student ( " + (i+1) +" ) : " );
            marks[i] = input.nextInt();
            sum += marks[i];
            min = marks[0];
            if(max < marks[i]){
                max = marks[i];
            }else if (min > marks[i]){
                min = marks[i];
            }
        }
        int average = sum/studentnum;
        System.out.println(" the average of the students marks : " + average );
        System.out.println("The highest Grade : " + max);
        System.out.println("The lowest Grade : " + min);
        for(int i = 0 ; i < studentnum ; i++){
            System.out.println(" student : " + i + " mark : " + marks[i]);
        }
        int passed = 0;
        for (int mark : marks) {
            if (mark >= 50) {
                passed++;
        }}
        int failed = studentnum - passed ;
        System.out.println(" the number of students how passed : " + passed);
        System.out.println(" the number of students how failed : " + failed);

    }
}
