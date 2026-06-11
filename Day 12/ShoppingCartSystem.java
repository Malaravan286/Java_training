import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cart = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Shopping Cart System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Remove Product");
            System.out.println("4. View Cart");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    cart.add(scanner.nextLine());
                    System.out.println("Product added.");
                    break;
                case 2:
                    System.out.print("Enter product name to update: ");
                    String oldProduct = scanner.nextLine();
                    int index = cart.indexOf(oldProduct);
                    if (index != -1) {
                        System.out.print("Enter new product name: ");
                        cart.set(index, scanner.nextLine());
                        System.out.println("Product updated.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter product name to remove: ");
                    if (cart.remove(scanner.nextLine())) {
                        System.out.println("Product removed.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.println("Cart products: " + cart);
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
