/**
 * Let's see the solution of the Example-1 problem by a java try-catch block.
 */
public class TryCatchExample2 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
        }
        // handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}