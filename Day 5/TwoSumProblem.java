import java.util.Scanner;

public class TwoSumProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int value : numbers) {
            sum += value;
            if (value < min) min = value;
            if (value > max) max = value;
        }
        System.out.println("Program: TwoSumProblem");
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
