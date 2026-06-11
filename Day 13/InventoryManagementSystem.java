import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> inventory = new HashMap<>();

        while (true) {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Product Stock");
            System.out.println("2. Update Stock");
            System.out.println("3. Remove Product");
            System.out.println("4. View Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String product = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    inventory.put(product, quantity);
                    System.out.println("Product stock saved.");
                    break;
                case 2:
                    System.out.print("Enter product name to update: ");
                    String updateProduct = scanner.nextLine();
                    if (inventory.containsKey(updateProduct)) {
                        System.out.print("Enter new quantity: ");
                        inventory.put(updateProduct, scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("Stock updated.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter product name to remove: ");
                    if (inventory.remove(scanner.nextLine()) != null) {
                        System.out.println("Product removed.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.println("Inventory: " + inventory);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
