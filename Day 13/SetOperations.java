import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> uniqueItems = new HashSet<>();
        LinkedHashSet<String> insertionOrder = new LinkedHashSet<>();
        TreeSet<String> sortedItems = new TreeSet<>();
        HashMap<String, Integer> counts = new HashMap<>();

        System.out.println("Set Operations");
        System.out.print("How many values do you want to enter? ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter value " + i + ": ");
            String value = scanner.nextLine();
            uniqueItems.add(value);
            insertionOrder.add(value);
            sortedItems.add(value);
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }

        // Different collections show uniqueness, insertion order, sorting, and frequency.
        System.out.println("HashSet unique values: " + uniqueItems);
        System.out.println("LinkedHashSet insertion order: " + insertionOrder);
        System.out.println("TreeSet sorted values: " + sortedItems);
        System.out.println("HashMap counts: " + counts);
    }
}
