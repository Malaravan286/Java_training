import java.util.Scanner;

public class AverageOfThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int c = scanner.nextInt();
        System.out.println("Average: " + ((a + b + c) / 3.0));
        scanner.close();
    }
}
