import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Student List Operations ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student");
            System.out.println("5. View Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    students.add(scanner.nextLine());
                    System.out.println("Student added.");
                    break;
                case 2:
                    System.out.print("Enter student name to update: ");
                    String oldName = scanner.nextLine();
                    int updateIndex = students.indexOf(oldName);
                    if (updateIndex != -1) {
                        System.out.print("Enter new name: ");
                        students.set(updateIndex, scanner.nextLine());
                        System.out.println("Student updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    if (students.remove(removeName)) {
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = scanner.nextLine();
                    if (students.contains(searchName)) {
                        System.out.println("Student found.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Students: " + students);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
