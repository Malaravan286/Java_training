import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstSet = readSet(scanner, "first");
        Set<Integer> secondSet = readSet(scanner, "second");

        Set<Integer> union = new HashSet<>(firstSet);
        union.addAll(secondSet);

        Set<Integer> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);

        Set<Integer> difference = new HashSet<>(firstSet);
        difference.removeAll(secondSet);

        System.out.println("First Set: " + firstSet);
        System.out.println("Second Set: " + secondSet);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference (First - Second): " + difference);
        scanner.close();
    }

    private static Set<Integer> readSet(Scanner scanner, String setName) {
        Set<Integer> numbers = new HashSet<>();
        System.out.print("How many numbers in the " + setName + " set? ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }
}
