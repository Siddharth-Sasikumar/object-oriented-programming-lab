import java.io.*;
import java.nio.file.*;

public class FileReplace {
    public static void main(String[] args) {
        String filePath = "data.txt";
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            content = content.replace("first", "updated");
            Files.write(Paths.get(filePath), content.getBytes());
            System.out.println("Word replaced successfully.");
        } catch (IOException e) {
            System.out.println("Error processing file.");
        }
    }
}
