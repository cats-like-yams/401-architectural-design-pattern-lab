package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Publisher {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String title, String category) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(title, category);
        }
    }

    public void publishArticle(String title, String category) {
        System.out.println("New article published: " + title + " in category: " + category);
        notifySubscribers(title, category);
    }
}
