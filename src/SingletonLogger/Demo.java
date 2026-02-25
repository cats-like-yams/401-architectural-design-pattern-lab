package SingletonLogger;

public class Demo {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("First Message");
        logger2.log("Second Message");
        System.out.println("Same instance? " + (logger1 == logger2));
    }
}
