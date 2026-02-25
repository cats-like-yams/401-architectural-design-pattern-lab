package AbstractFactory;

public class Demo {
    public static void main(String[] args) {
        String os = "windows";
        GUIFactory factory;
        if ("windows".equalsIgnoreCase(os)) {
            factory = new WindowsFactory();
        }else{
            factory = new MacFactory();
        }
        Application app = new Application(factory);
        app.render();
    }
}
