import java.io.FileOutputStream;

public class FileOutputStreamExample1 {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("testout1.txt")) {
            fout.write(65);
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
