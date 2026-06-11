interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("Push notification sent: " + message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Notification[] notifications = {
            new EmailNotification(),
            new SmsNotification(),
            new PushNotification()
        };

        for (Notification notification : notifications) {
            notification.send("Your placement test starts tomorrow.");
        }
    }
}
