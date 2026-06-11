import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmailRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> emails = new HashSet<>();

        while (true) {
            System.out.println("\n--- Email Registration System ---");
            System.out.println("1. Register Email");
            System.out.println("2. Check Email");
            System.out.println("3. View Registered Emails");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    if (emails.add(email)) {
                        System.out.println("Email registered.");
                    } else {
                        System.out.println("Email already registered.");
                    }
                    break;
                case 2:
                    System.out.print("Enter email to check: ");
                    System.out.println("Registered: " + emails.contains(scanner.nextLine()));
                    break;
                case 3:
                    System.out.println("Registered emails: " + emails);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
