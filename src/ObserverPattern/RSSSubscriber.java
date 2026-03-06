package ObserverPattern;

public class RSSSubscriber implements Subscriber {
    public void update(String title, String category) {
        System.out.println("RSS feed updated: " + title + " in category: " + category);
    }
}
