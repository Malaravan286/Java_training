import java.util.Scanner;

public class OnlineLearningPlatform {
    static class Course {
        private String name;
        private double amount;

        Course(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() { return name; }
        public double getAmount() { return amount; }
        public double calculate() { return amount; }
    }

    static class FreeCourse extends Course {
        FreeCourse(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.95; }
    }

    static class PaidCourse extends Course {
        PaidCourse(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() + 75; }
    }

    static class CertificationCourse extends Course {
        CertificationCourse(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.90 + 50; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter course fee: ");
        double amount = scanner.nextDouble();

        // Parent class references call child overridden methods at runtime.
        Course[] records = {new FreeCourse(name, amount), new PaidCourse(name, amount), new CertificationCourse(name, amount)};
        for (Course record : records) {
            System.out.println(record.getClass().getSimpleName() + " payable fee: " + record.calculate());
        }
        scanner.close();
    }
}
