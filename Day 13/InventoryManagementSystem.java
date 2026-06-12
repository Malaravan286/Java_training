import java.util.*;
public class InventoryManagementSystem { public static void main(String[] args) { Map<String, Integer> inventory = new HashMap<>(); inventory.put("Pen", 100); inventory.put("Book", 40); inventory.put("Bag", 15); inventory.put("Pen", inventory.get("Pen") - 5); System.out.println(inventory); } }
