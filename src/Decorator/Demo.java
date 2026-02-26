package Decorator;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //basic email notifier
        Notifier notifier = new EmailNotifier(List.of("alice@example.com", "bob@example.com"));


        //decorate with SMS
        Notifier smsAndEmail = new SMSDecorator(notifier, "+1234567890");
        smsAndEmail.send("System reboot scheduled at 2 AM");

        //decorate with multiple channels
        Notifier fullStack = new FacebookDecorator(
                new SlackDecorator(
                        new SMSDecorator(notifier, "1234567890"),
                        "devops_team"),
        "Alice FB");
            fullStack.send("Critical incident: database unreachable");
    }
}

