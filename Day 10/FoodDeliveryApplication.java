import java.util.Scanner;

public class FoodDeliveryApplication {
    static class Order {
        private String name;
        private double amount;

        Order(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() { return name; }
        public double getAmount() { return amount; }
        public double calculate() { return amount; }
    }

    static class RegularOrder extends Order {
        RegularOrder(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.95; }
    }

    static class ExpressOrder extends Order {
        ExpressOrder(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() + 75; }
    }

    static class BulkOrder extends Order {
        BulkOrder(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.90 + 50; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter order amount: ");
        double amount = scanner.nextDouble();

        // Parent class references call child overridden methods at runtime.
        Order[] records = {new RegularOrder(name, amount), new ExpressOrder(name, amount), new BulkOrder(name, amount)};
        for (Order record : records) {
            System.out.println(record.getClass().getSimpleName() + " delivery charge: " + record.calculate());
        }
        scanner.close();
    }
}
