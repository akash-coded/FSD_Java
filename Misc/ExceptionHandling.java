import java.io.IOException;

public class ExceptionHandling {
    private static String printEvenOrOdd(int digit) throws IOException {
        // try {
        // System.out.println(5 / 0);
        // } catch (Exception e) {
        // System.out.println("Exception handled in printEvenOrOdd");
        // }
        // System.out.println(5 / 0);
        throw new IOException();
        // return (digit % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println("Before Exception Occurs");
        try {
            System.out.println(printEvenOrOdd(5));
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
        System.out.println("After the exception has occurred");
    }
}
