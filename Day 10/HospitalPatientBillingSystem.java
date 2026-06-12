import java.util.Scanner;

public class HospitalPatientBillingSystem {
    static class Patient {
        private String name;
        private double amount;

        Patient(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() { return name; }
        public double getAmount() { return amount; }
        public double calculate() { return amount; }
    }

    static class OutPatient extends Patient {
        OutPatient(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.95; }
    }

    static class InPatient extends Patient {
        InPatient(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() + 75; }
    }

    static class EmergencyPatient extends Patient {
        EmergencyPatient(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.90 + 50; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter treatment cost: ");
        double amount = scanner.nextDouble();

        // Parent class references call child overridden methods at runtime.
        Patient[] records = {new OutPatient(name, amount), new InPatient(name, amount), new EmergencyPatient(name, amount)};
        for (Patient record : records) {
            System.out.println(record.getClass().getSimpleName() + " final bill: " + record.calculate());
        }
        scanner.close();
    }
}
