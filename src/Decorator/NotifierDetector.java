package Decorator;

public abstract class NotifierDetector implements Notifier {
    protected Notifier wrappee;

    public NotifierDetector(Notifier notifier) {
        this.wrappee = notifier;
    }

    public void send(String message) {
        wrappee.send(message);
    }
}
