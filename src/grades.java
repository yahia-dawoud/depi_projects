import java.util.Scanner;

public class grades {
    public static double calculateAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    public static char determineGrade(double average) {
        if (average >= 85) {
            return 'A';
        } else if (average >= 70) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student : " + (i + 1));

            // Get student name
            System.out.println("Enter student's name: ");
            String name = input.next();

            // Get three exam scores
            System.out.println("Enter first exam score: ");
            double score1 = input.nextDouble();

            System.out.println("Enter second exam score: ");
            double score2 = input.nextDouble();

            System.out.println("Enter third exam score: ");
            double score3 = input.nextDouble();

            double average = grades.calculateAverage(score1, score2, score3);
            char grade = grades.determineGrade(average);


            System.out.println("Student Summary:");
            System.out.println("Name: " + name);
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);

        }

    }
}
