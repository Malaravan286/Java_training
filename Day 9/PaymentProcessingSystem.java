interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using credit card.");
    }
}

class UpiPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}

class WalletPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using wallet.");
    }
}

public class PaymentProcessingSystem {
    public static void main(String[] args) {
        PaymentMethod[] methods = {
            new CreditCardPayment(),
            new UpiPayment(),
            new WalletPayment()
        };

        for (PaymentMethod method : methods) {
            method.pay(1200.50);
        }
    }
}
