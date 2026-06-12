import java.util.*;

public class OnlineLearningPlatform {
    static class ServiceItem {
        private String name;
        private double amount;

        ServiceItem(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        String getName() { return name; }
        double getAmount() { return amount; }

        double calculateFinalAmount() {
            return amount;
        }

        void printBill() {
            System.out.println(name + " final amount: Rs." + calculateFinalAmount());
        }
    }

    static class RegularItem extends ServiceItem {
        RegularItem(String name, double amount) {
            super(name, amount);
        }

        @Override
        double calculateFinalAmount() {
            return getAmount();
        }
    }

    static class PremiumItem extends ServiceItem {
        PremiumItem(String name, double amount) {
            super(name, amount);
        }

        @Override
        double calculateFinalAmount() {
            return getAmount() * 0.90;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Online Learning Platform");
        System.out.print("Enter customer/user name: ");
        String name = scanner.nextLine();
        System.out.print("Enter base amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Choose type (1-regular, 2-premium): ");
        int type = scanner.nextInt();

        ServiceItem item = type == 2 ? new PremiumItem(name, amount) : new RegularItem(name, amount);
        // The overridden method is selected at runtime.
        item.printBill();
    }
}
