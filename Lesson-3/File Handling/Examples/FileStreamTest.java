import java.io.*;

public class FileStreamTest {
    public static void main(String args[]) {
        try (OutputStream os = new FileOutputStream("test.txt"); InputStream is = new FileInputStream("test.txt");) {
            byte[] bWrite = { 65, 90, 48, 57, 97, 122 };
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }

            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
