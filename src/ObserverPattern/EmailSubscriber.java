package ObserverPattern;

public class EmailSubscriber implements Subscriber {
    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    public void update(String title, String category) {
        System.out.println("Email sent to " + email +
                ": New article " + title + " in category: " + category);
    }
}
