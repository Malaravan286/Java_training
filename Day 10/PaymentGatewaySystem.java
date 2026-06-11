class GatewayPayment {
    private double amount;

    GatewayPayment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void processPayment() {
        System.out.println("Processing payment of Rs." + amount);
    }
}

class CardGatewayPayment extends GatewayPayment {
    CardGatewayPayment(double amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("Card gateway processed Rs." + getAmount());
    }
}

class NetBankingPayment extends GatewayPayment {
    NetBankingPayment(double amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("Net banking gateway processed Rs." + getAmount());
    }
}

public class PaymentGatewaySystem {
    public static void main(String[] args) {
        GatewayPayment[] payments = {
            new CardGatewayPayment(1500),
            new NetBankingPayment(2200)
        };

        for (GatewayPayment payment : payments) {
            payment.processPayment();
        }
    }
}
