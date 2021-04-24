/**
 * Here, we handle the exception using the parent class exception in the catch
 * block. We also display a custom message from the catch block
 */
public class TryCatchExample4 {

    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
        }
        // handling the exception by using Exception class
        catch (Exception e) {
            System.out.println("Can't divided by zero");
            e.printStackTrace();
        }
        System.out.println("rest of the code");
    }

}
