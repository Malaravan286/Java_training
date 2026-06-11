import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> employees = new HashMap<>();

        while (true) {
            System.out.println("\n--- Employee Directory ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. View Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee id: ");
                    int addId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter employee name: ");
                    employees.put(addId, scanner.nextLine());
                    System.out.println("Employee added.");
                    break;
                case 2:
                    System.out.print("Enter employee id to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    if (employees.containsKey(updateId)) {
                        System.out.print("Enter new employee name: ");
                        employees.put(updateId, scanner.nextLine());
                        System.out.println("Employee updated.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter employee id to remove: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    if (employees.remove(removeId) != null) {
                        System.out.println("Employee removed.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.println("Employees: " + employees);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
