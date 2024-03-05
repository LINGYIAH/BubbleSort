import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student ID:");
            String studentID = scanner.nextLine();
            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();
            System.out.println("Enter the number of extra activities:");
            int activitiesCount = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline

            Student student = new Student(studentID, studentName, activitiesCount);
            for (int j = 0; j < activitiesCount; j++) {
                System.out.println("Enter activity " + (j + 1) + ":");
                String activity = scanner.nextLine();
                student.addExtraActivity(activity);
            }

            System.out.println(student);
        }
    }
}