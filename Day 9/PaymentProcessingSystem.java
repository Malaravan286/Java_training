import java.util.Scanner;

public class PaymentProcessingSystem {
    interface PaymentMethod {
        void pay(String value);
    }

    static class CreditCardPayment implements PaymentMethod {
        public void pay(String value) {
            System.out.println("Paid by credit card: " + value);
        }
    }

    static class UpiPayment implements PaymentMethod {
        public void pay(String value) {
            System.out.println("Paid using UPI: " + value);
        }
    }

    static class WalletPayment implements PaymentMethod {
        public void pay(String value) {
            System.out.println("Paid from wallet: " + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amountText: ");
        String amountText = scanner.nextLine();

        // Interface reference stores different implementations for runtime polymorphism.
        PaymentMethod[] services = {new CreditCardPayment(), new UpiPayment(), new WalletPayment()};
        services[0].pay(amountText);
        services[1].pay(amountText);
        services[2].pay(amountText);
        scanner.close();
    }
}
