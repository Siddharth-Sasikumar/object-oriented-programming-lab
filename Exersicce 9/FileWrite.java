import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write("This is the first line.");
            writer.close();
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
