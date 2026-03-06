package ObserverPattern;

public class Demo {
    public static void main(String[] args) {
        Blog blog = new Blog();
        Subscriber emailSub = new EmailSubscriber("reader@example.com");
        Subscriber rssSub = new RSSSubscriber();
        Subscriber pushSub = new PushSubscriber("device123");

        blog.addSubscriber(emailSub);
        blog.addSubscriber(rssSub);
        blog.addSubscriber(pushSub);

        blog.publishArticle("Observer Pattern in Java", "programming");
        blog.publishArticle("Top 10 Travel Destinations", "travel");

        blog.removeSubscriber(rssSub);

        blog.publishArticle("Healthy Lifestyle Tips", "health");

    }
}
