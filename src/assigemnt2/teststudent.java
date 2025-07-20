package assigemnt2;

public class teststudent {
    public static void main(String[] args) {
        Student[] students = new Student[3];


        students[0] = new Student("yahia", 18, 3.83);
        students[1] = new Student("haya", 18, 3.89);
        students[2] = new Student("moaz", 18, 3.62);


        System.out.println("Initial Student Information:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }

        System.out.println("*******************************");

        System.out.println("Students studying:");
        for (Student student : students) {
            student.study();
        }

        System.out.println("*******************************");

        System.out.println("\nModifying student information:");
        students[0].setName("ibrahim");
        students[0].setAge(20);
        students[0].setGpa(3.95);

        System.out.println("*******************************");

        System.out.println("Updated information for first student:");
        System.out.println("Name: " + students[0].getName());
        System.out.println("Age: " + students[0].getAge());
        System.out.println("GPA: " + students[0].getGpa());
    }
}
