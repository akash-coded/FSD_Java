import java.io.*;

class M {
    void method() throws IOException {
        throw new IOException("device error");
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
            System.out.println("exception handled");
        }

        System.out.println("normal flow...");
    }
}
