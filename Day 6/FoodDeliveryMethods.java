import java.util.Scanner;

public class FoodDeliveryMethods {
    public static double calculateTotal(double first, double second) {
        return first + second;
    }

    public static boolean isSuccessful(double value) {
        return value >= 50;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program: FoodDeliveryMethods");
        System.out.print("Enter first value: ");
        double first = scanner.nextDouble();
        System.out.print("Enter second value: ");
        double second = scanner.nextDouble();
        double result = calculateTotal(first, second);
        System.out.println("Calculated result: " + result);
        System.out.println(isSuccessful(result) ? "Status: Successful" : "Status: Not successful");
        scanner.close();
    }
}
