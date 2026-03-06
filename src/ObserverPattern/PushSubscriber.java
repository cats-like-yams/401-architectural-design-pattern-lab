package ObserverPattern;

public class PushSubscriber implements Subscriber {
    private String deviceID;

    public PushSubscriber(String deviceID) {
        this.deviceID = deviceID;
    }

    public void update(String title, String category) {
        System.out.println("Push notification to " + deviceID + ": " + title + " in category: " + category);
    }
}
