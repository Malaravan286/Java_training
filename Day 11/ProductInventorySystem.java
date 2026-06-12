import java.util.*;
public class ProductInventorySystem {
    static class Product { String name; int stock; Product(String name, int stock) { this.name = name; this.stock = stock; } }
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>(); products.add(new Product("Pen", 50)); products.add(new Product("Notebook", 25)); products.add(new Product("Bag", 10));
        products.sort(Comparator.comparingInt(p -> p.stock)); for (Product p : products) System.out.println(p.name + " stock: " + p.stock);
    }
}
