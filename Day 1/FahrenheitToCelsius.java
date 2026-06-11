import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double f = scanner.nextDouble();
        System.out.println("Celsius: " + ((f - 32) * 5 / 9));
        scanner.close();
    }
}
