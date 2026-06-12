import java.util.Scanner;

public class UniversityPortal {
    interface PortalService {
        void showDetails(String value);
    }

    static class AdmissionService implements PortalService {
        public void showDetails(String value) {
            System.out.println("Checking admission details for " + value);
        }
    }

    static class FeeService implements PortalService {
        public void showDetails(String value) {
            System.out.println("Showing fee status for " + value);
        }
    }

    static class ResultService implements PortalService {
        public void showDetails(String value) {
            System.out.println("Displaying result for " + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter studentName: ");
        String studentName = scanner.nextLine();

        // Interface reference stores different implementations for runtime polymorphism.
        PortalService[] services = {new AdmissionService(), new FeeService(), new ResultService()};
        services[0].showDetails(studentName);
        services[1].showDetails(studentName);
        services[2].showDetails(studentName);
        scanner.close();
    }
}
