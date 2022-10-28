package creational_patterns.singleton;

public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance()
    {
        return instance;
    }
    public static void confirmation()
    {
        System.out.println("the singleton is secure...");

    }

}
