public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2() { }

    public static Singleton2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        System.out.println("Singleton2 instance created: " + instance);
    }
}