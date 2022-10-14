package creational_patterns.factory_method;
interface Notification{
    void notifyUser();
}
class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending email notification...");
    }
}
class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending sms notification...");
    }
}
class PushNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending push notification...");
    }
}
public class Factory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " + channel);
        }
    }
}
