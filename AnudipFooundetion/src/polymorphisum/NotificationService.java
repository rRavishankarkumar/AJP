package polymorphisum;

interface Notification {
    void sendNotification();
}

class EmailNotification implements Notification {
    public void sendNotification() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification implements Notification {
    public void sendNotification() {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification implements Notification {
    public void sendNotification() {
        System.out.println("Sending Push Notification");
    }
}

public class NotificationService {
    public static void main(String[] args) {
        Notification notification;

        notification = new EmailNotification();
        notification.sendNotification();  // Output: Sending Email Notification

        notification = new SMSNotification();
        notification.sendNotification();  // Output: Sending SMS Notification
    }
}

