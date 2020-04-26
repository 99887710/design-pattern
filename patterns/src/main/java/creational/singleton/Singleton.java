package creational.singleton;

/* Single threaded environment */
public class Singleton {
    private static Singleton instance;
    private static String value;

    private Singleton() {
        value = "singleton";
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
