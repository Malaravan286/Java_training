import java.util.Scanner;

public class EcommerceDiscountSystem {
    static class Product {
        private String name;
        private double amount;

        Product(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() { return name; }
        public double getAmount() { return amount; }
        public double calculate() { return amount; }
    }

    static class RegularProduct extends Product {
        RegularProduct(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.95; }
    }

    static class FestivalProduct extends Product {
        FestivalProduct(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() + 75; }
    }

    static class PremiumProduct extends Product {
        PremiumProduct(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.90 + 50; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double amount = scanner.nextDouble();

        // Parent class references call child overridden methods at runtime.
        Product[] records = {new RegularProduct(name, amount), new FestivalProduct(name, amount), new PremiumProduct(name, amount)};
        for (Product record : records) {
            System.out.println(record.getClass().getSimpleName() + " discounted price: " + record.calculate());
        }
        scanner.close();
    }
}
