import java.io.*;

public class FileInputStreamExample1 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("testout1.txt")) {
            char ch = (char) fin.read();
            System.out.print(ch);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
