import java.util.Scanner;

public class PaymentGatewaySystem {
    static class Payment {
        private String name;
        private double amount;

        Payment(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() { return name; }
        public double getAmount() { return amount; }
        public double calculate() { return amount; }
    }

    static class CardPayment extends Payment {
        CardPayment(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.95; }
    }

    static class UpiPayment extends Payment {
        UpiPayment(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() + 75; }
    }

    static class NetBankingPayment extends Payment {
        NetBankingPayment(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.90 + 50; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        // Parent class references call child overridden methods at runtime.
        Payment[] records = {new CardPayment(name, amount), new UpiPayment(name, amount), new NetBankingPayment(name, amount)};
        for (Payment record : records) {
            System.out.println(record.getClass().getSimpleName() + " processing fee: " + record.calculate());
        }
        scanner.close();
    }
}
