import java.util.Scanner;

public class NotificationSystem {
    interface Notification {
        void send(String value);
    }

    static class EmailNotification implements Notification {
        public void send(String value) {
            System.out.println("Sending email " + value);
        }
    }

    static class SmsNotification implements Notification {
        public void send(String value) {
            System.out.println("Sending SMS " + value);
        }
    }

    static class PushNotification implements Notification {
        public void send(String value) {
            System.out.println("Sending app notification " + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        // Interface reference stores different implementations for runtime polymorphism.
        Notification[] services = {new EmailNotification(), new SmsNotification(), new PushNotification()};
        services[0].send(message);
        services[1].send(message);
        services[2].send(message);
        scanner.close();
    }
}
