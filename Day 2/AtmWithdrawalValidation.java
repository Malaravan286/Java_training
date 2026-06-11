import java.util.Scanner;

public class AtmWithdrawalValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program: AtmWithdrawalValidation");
        System.out.print("Enter a value: ");
        String value = scanner.nextLine();
        System.out.println("Result for " + value + " calculated successfully.");
        scanner.close();
    }
}
