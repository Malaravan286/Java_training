import java.util.Scanner;

public class LibraryManagementSystem {
    static class LibraryItem {
        private String name;
        private double amount;

        LibraryItem(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() { return name; }
        public double getAmount() { return amount; }
        public double calculate() { return amount; }
    }

    static class Book extends LibraryItem {
        Book(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.95; }
    }

    static class Magazine extends LibraryItem {
        Magazine(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() + 75; }
    }

    static class ReferenceBook extends LibraryItem {
        ReferenceBook(String name, double amount) { super(name, amount); }
        @Override public double calculate() { return getAmount() * 0.90 + 50; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double amount = scanner.nextDouble();

        // Parent class references call child overridden methods at runtime.
        LibraryItem[] records = {new Book(name, amount), new Magazine(name, amount), new ReferenceBook(name, amount)};
        for (LibraryItem record : records) {
            System.out.println(record.getClass().getSimpleName() + " late fee: " + record.calculate());
        }
        scanner.close();
    }
}
