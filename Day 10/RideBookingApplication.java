import java.util.Scanner;

public class RideBookingApplication {
    static class Ride {
        private String name;
        private double amount;

        Ride(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() { return name; }
        public double getAmount() { return amount; }
        public double calculate() { return amount; }
    }

    static class BikeRide extends Ride {
        BikeRide(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.95; }
    }

    static class AutoRide extends Ride {
        AutoRide(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() + 75; }
    }

    static class CabRide extends Ride {
        CabRide(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.90 + 50; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter base fare: ");
        double amount = scanner.nextDouble();

        // Parent class references call child overridden methods at runtime.
        Ride[] records = {new BikeRide(name, amount), new AutoRide(name, amount), new CabRide(name, amount)};
        for (Ride record : records) {
            System.out.println(record.getClass().getSimpleName() + " total fare: " + record.calculate());
        }
        scanner.close();
    }
}
