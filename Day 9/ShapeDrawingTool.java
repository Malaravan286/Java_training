import java.util.*;

public class ShapeDrawingTool {
    interface Operation {
        void execute(String input);
    }

    static class PrimaryOperation implements Operation {
        public void execute(String input) {
            System.out.println("Primary Shape Drawing Tool service processed: " + input);
        }
    }

    static class SecondaryOperation implements Operation {
        public void execute(String input) {
            System.out.println("Secondary Shape Drawing Tool service processed with priority: " + input);
        }
    }

    static void runOperation(Operation operation, String input) {
        operation.execute(input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shape Drawing Tool");
        System.out.print("Enter request details: ");
        String details = scanner.nextLine();
        System.out.print("Choose service type (1-primary, 2-secondary): ");
        int choice = scanner.nextInt();

        Operation operation = choice == 2 ? new SecondaryOperation() : new PrimaryOperation();
        // Runtime polymorphism chooses the correct execute method.
        runOperation(operation, details);
    }
}
