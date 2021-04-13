public class SingleThreaded {
    private static String threadName = "Main";

    public static void main(String[] args) {
        System.out.println("Running " + threadName);

        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
        }

        System.out.println("Thread " + threadName + " exiting.");
    }
}
