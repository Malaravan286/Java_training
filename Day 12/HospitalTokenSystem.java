import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HospitalTokenSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> patients = new LinkedList<>();

        while (true) {
            System.out.println("\n--- Hospital Token System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Serve Patient");
            System.out.println("3. View Waiting Patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    patients.add(scanner.nextLine());
                    System.out.println("Patient added to queue.");
                    break;
                case 2:
                    String servedPatient = patients.poll();
                    if (servedPatient == null) {
                        System.out.println("No patients waiting.");
                    } else {
                        System.out.println("Serving patient: " + servedPatient);
                    }
                    break;
                case 3:
                    System.out.println("Waiting patients: " + patients);
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
