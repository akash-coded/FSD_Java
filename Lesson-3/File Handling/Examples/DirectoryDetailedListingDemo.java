import java.io.*;

public class DirectoryDetailedListingDemo {
    public static void main(String[] args) {
        File dir = new File(
                "F:/Study Materials/Teaching Resources/Simplilearn/FSD_Trainer_PPT_1/Code Files and Examples/Phase-1");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getName() + " Can Write: " + file.canWrite() + "Is Hidden: " + file.isHidden()
                    + " Length: " + file.length() + " bytes");
        }
    }
}
