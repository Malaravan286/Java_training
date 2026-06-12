import java.util.*;
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); List<String> cart = new ArrayList<>(); int choice;
        do { System.out.println("1 Add item 2 Remove item 3 View cart 4 Exit"); choice = sc.nextInt(); sc.nextLine(); if (choice == 1) { System.out.print("Item: "); cart.add(sc.nextLine()); } else if (choice == 2) { System.out.print("Item: "); cart.remove(sc.nextLine()); } else if (choice == 3) System.out.println(cart); } while (choice != 4); sc.close();
    }
}
