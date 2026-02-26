package Decorator;

public class SlackDecorator extends NotifierDetector {
    private String channel;

    public SlackDecorator(Notifier notifier, String channel) {
        super(notifier);
        this.channel = channel;
    }

    public void send(String message) {
        System.out.println("Sending Slack message to " + channel + ": " + message);
        super.send(message);
    }
}
