public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.createNotification("email");
        Notification sms = factory.createNotification("sms");
        Notification push = factory.createNotification("push");

        email.send("Message sent by email");
        sms.send("Message sent by SMS");
        push.send("Message sent by push notification");
    }
}
