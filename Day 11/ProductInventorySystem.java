import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class ProductInventorySystem {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Laptop", 5, 55000));
        products.add(new Product("Mouse", 30, 500));
        products.add(new Product("Keyboard", 15, 1200));

        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product first, Product second) {
                return first.quantity - second.quantity;
            }
        });

        for (Product product : products) {
            System.out.println(product.name + " - Qty: " + product.quantity + ", Price: Rs." + product.price);
        }
    }
}
