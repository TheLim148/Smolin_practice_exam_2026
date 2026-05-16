public class NotificationFactory {
    public Notification createNotification(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Notification type cannot be null");
        }

        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            case "push" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }
}
