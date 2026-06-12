import java.util.Scanner;

public class VehicleTollCollectionSystem {
    static class Vehicle {
        private String name;
        private double amount;

        Vehicle(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() { return name; }
        public double getAmount() { return amount; }
        public double calculate() { return amount; }
    }

    static class Car extends Vehicle {
        Car(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.95; }
    }

    static class Bus extends Vehicle {
        Bus(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() + 75; }
    }

    static class Truck extends Vehicle {
        Truck(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.90 + 50; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter base toll: ");
        double amount = scanner.nextDouble();

        // Parent class references call child overridden methods at runtime.
        Vehicle[] records = {new Car(name, amount), new Bus(name, amount), new Truck(name, amount)};
        for (Vehicle record : records) {
            System.out.println(record.getClass().getSimpleName() + " toll amount: " + record.calculate());
        }
        scanner.close();
    }
}
