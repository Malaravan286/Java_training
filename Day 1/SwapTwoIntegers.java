import java.util.Scanner;

public class SwapTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        int temp = a; a = b; b = temp;
        System.out.println("After swap: " + a + " " + b);
        scanner.close();
    }
}
