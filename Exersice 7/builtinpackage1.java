import java.util.Scanner;  
import java.io.FileWriter; 
import java.io.IOException; 

public class builtinpackage1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Enter your age:");
        int age = input.nextInt();

        try {
            FileWriter writer = new FileWriter("user_info.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age);
            writer.close();
            System.out.println("User info saved to file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the file.");
        }

        input.close();
    }
}
