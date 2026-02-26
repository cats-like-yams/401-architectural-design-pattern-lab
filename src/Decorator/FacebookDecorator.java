package Decorator;

public class FacebookDecorator extends NotifierDetector{
    private String acccount;

    public FacebookDecorator(Notifier notifier, String acccount) {
        super(notifier);
        this.acccount = acccount;
    }

    public void send(String message) {
        System.out.println("Sending facebook message to: " + acccount + ": " + message);
    }
}
