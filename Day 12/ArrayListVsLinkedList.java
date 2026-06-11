import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        while (true) {
            System.out.println("\n--- ArrayList Vs LinkedList ---");
            System.out.println("1. Add item");
            System.out.println("2. Add item at first position");
            System.out.println("3. Remove item");
            System.out.println("4. Search item");
            System.out.println("5. View both lists");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item: ");
                    String item = scanner.nextLine();
                    arrayList.add(item);
                    linkedList.add(item);
                    System.out.println("Added to both lists.");
                    break;
                case 2:
                    System.out.print("Enter item: ");
                    String firstItem = scanner.nextLine();
                    arrayList.add(0, firstItem);
                    linkedList.add(0, firstItem);
                    System.out.println("Added at first position in both lists.");
                    break;
                case 3:
                    System.out.print("Enter item to remove: ");
                    String removeItem = scanner.nextLine();
                    arrayList.remove(removeItem);
                    linkedList.remove(removeItem);
                    System.out.println("Remove operation completed on both lists.");
                    break;
                case 4:
                    System.out.print("Enter item to search: ");
                    String searchItem = scanner.nextLine();
                    System.out.println("ArrayList contains item: " + arrayList.contains(searchItem));
                    System.out.println("LinkedList contains item: " + linkedList.contains(searchItem));
                    break;
                case 5:
                    System.out.println("ArrayList: " + arrayList);
                    System.out.println("LinkedList: " + linkedList);
                    System.out.println("ArrayList is generally faster for random access.");
                    System.out.println("LinkedList is useful for frequent insertions and removals.");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
