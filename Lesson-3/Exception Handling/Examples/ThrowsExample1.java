import java.io.*;

class M {
    void method() throws IOException {
        throw new IOException("device error");

        // try {
        // throw new IOException("device error");
        // } catch (IOException ex) {
        // System.out.println("Caught inside M class" + ex);
        // }
    }
}

/**
 * Case1: You handle the exception
 */
public class ThrowsExample1 {
    public static void main(String args[]) {
        try {
            M m = new M();
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled inisde main method");
        }

        System.out.println("normal flow...");
    }
}
