import java.util.Scanner;

public class FoodOrderingApplication {
    interface FoodOrder {
        void placeOrder(String value);
    }

    static class DineInOrder implements FoodOrder {
        public void placeOrder(String value) {
            System.out.println("Preparing dine-in order for " + value);
        }
    }

    static class TakeAwayOrder implements FoodOrder {
        public void placeOrder(String value) {
            System.out.println("Packing takeaway order for " + value);
        }
    }

    static class DeliveryOrder implements FoodOrder {
        public void placeOrder(String value) {
            System.out.println("Assigning delivery partner for " + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer: ");
        String customer = scanner.nextLine();

        // Interface reference stores different implementations for runtime polymorphism.
        FoodOrder[] services = {new DineInOrder(), new TakeAwayOrder(), new DeliveryOrder()};
        services[0].placeOrder(customer);
        services[1].placeOrder(customer);
        services[2].placeOrder(customer);
        scanner.close();
    }
}
