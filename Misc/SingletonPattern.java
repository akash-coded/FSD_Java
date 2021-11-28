class Singleton {
    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        // Singleton obj1 = new Singleton();
        // Singleton obj2 = new Singleton();

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println("Object-1:: " + obj1.hashCode());
        System.out.println("Object-2:: " + obj2.hashCode());
    }
}
