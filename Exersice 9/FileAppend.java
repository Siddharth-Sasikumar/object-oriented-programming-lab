import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt", true);
            writer.write("\nThis line is appended.");
            writer.close();
            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file.");
        }
    }
}
