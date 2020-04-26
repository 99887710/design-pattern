package creational.singleton;

public class Demo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("s1 value: " + s1.getValue());
        System.out.println("s2 value: " + s2.getValue());
        System.out.println(String.format("s1 equals s2: %s", s1 ==s2));
    }
}
