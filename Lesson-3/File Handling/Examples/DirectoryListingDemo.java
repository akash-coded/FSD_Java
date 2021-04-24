import java.io.*;

public class DirectoryListingDemo {
    public static void main(String[] args) {
        File f = new File(
                "F:/Study Materials/Teaching Resources/Simplilearn/FSD_Trainer_PPT_1/Code Files and Examples/Phase-1");
        String filenames[] = f.list();
        for (String filename : filenames) {
            System.out.println(filename);
        }
    }
}
