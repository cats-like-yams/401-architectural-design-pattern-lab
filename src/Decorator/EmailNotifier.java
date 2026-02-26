package Decorator;

import java.util.List;

//concrete component
public class EmailNotifier implements Notifier{
    private List<String> emails;

    public EmailNotifier(List<String> emails) {
        this.emails = emails;
    }
    @Override
    public void send(String message) {
        System.out.println("Sending email to: " + emails + ": " + message);
    }
}
