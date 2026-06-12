import java.util.Scanner;

public class BankingApplication {
    static class Account {
        private String name;
        private double amount;

        Account(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() { return name; }
        public double getAmount() { return amount; }
        public double calculate() { return amount; }
    }

    static class SavingsAccount extends Account {
        SavingsAccount(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.95; }
    }

    static class CurrentAccount extends Account {
        CurrentAccount(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() + 75; }
    }

    static class SalaryAccount extends Account {
        SalaryAccount(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.90 + 50; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter balance: ");
        double amount = scanner.nextDouble();

        // Parent class references call child overridden methods at runtime.
        Account[] records = {new SavingsAccount(name, amount), new CurrentAccount(name, amount), new SalaryAccount(name, amount)};
        for (Account record : records) {
            System.out.println(record.getClass().getSimpleName() + " available balance: " + record.calculate());
        }
        scanner.close();
    }
}
