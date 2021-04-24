import java.io.FileOutputStream;

public class FileOutputStreamExample2 {
    public static void main(String args[]) {
        try (FileOutputStream fout = new FileOutputStream("testout2.txt")) {
            String s = "Enjoy the session!";
            byte b[] = s.getBytes();// converting string into byte array
            fout.write(b);
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}