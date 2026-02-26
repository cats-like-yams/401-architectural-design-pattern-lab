package Decorator;

public class SMSDecorator extends NotifierDetector {
    private String phone;

    public SMSDecorator(Notifier notifier, String phone) {
        super(notifier);
        this.phone = phone;
    }

    public void send(String message) {
        System.out.println("Sending SMS to " + phone + ": " + message);
        super.send(message);
    }

}
