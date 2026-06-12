import java.util.Scanner;

public class EmployeeSalaryProcessingSystem {
    static class Employee {
        private String name;
        private double amount;

        Employee(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() { return name; }
        public double getAmount() { return amount; }
        public double calculate() { return amount; }
    }

    static class FullTimeEmployee extends Employee {
        FullTimeEmployee(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.95; }
    }

    static class PartTimeEmployee extends Employee {
        PartTimeEmployee(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() + 75; }
    }

    static class ContractEmployee extends Employee {
        ContractEmployee(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.90 + 50; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter base salary: ");
        double amount = scanner.nextDouble();

        // Parent class references call child overridden methods at runtime.
        Employee[] records = {new FullTimeEmployee(name, amount), new PartTimeEmployee(name, amount), new ContractEmployee(name, amount)};
        for (Employee record : records) {
            System.out.println(record.getClass().getSimpleName() + " net salary: " + record.calculate());
        }
        scanner.close();
    }
}
