import java.io.*;

class N {
    void method() throws IOException {
        throw new IOException("device error");
    }
}

/**
 * Case2: You declare the exception
 */
public class ThrowsExample2 {
    public static void main(String[] args) throws IOException {// declare exception
        N n = new N();
        n.method();

        System.out.println("normal flow...");
    }
}
