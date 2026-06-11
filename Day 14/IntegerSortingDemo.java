import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IntegerSortingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);
        scanner.close();
    }
}
