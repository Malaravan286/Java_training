import java.util.Scanner;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class CalculatorFunctionalInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a * b;
        Calculator divide = (a, b) -> b == 0 ? 0 : a / b;

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add.calculate(first, second));
                break;
            case 2:
                System.out.println("Result: " + subtract.calculate(first, second));
                break;
            case 3:
                System.out.println("Result: " + multiply.calculate(first, second));
                break;
            case 4:
                if (second == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + divide.calculate(first, second));
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
