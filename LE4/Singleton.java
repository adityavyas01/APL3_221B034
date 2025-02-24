public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() { }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println("Singleton instance created: " + instance);
    }
}