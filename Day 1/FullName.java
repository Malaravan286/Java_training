import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String first = scanner.next();
        System.out.print("Enter last name: ");
        String last = scanner.next();
        System.out.println("Full name: " + first + " " + last);
        scanner.close();
    }
}
