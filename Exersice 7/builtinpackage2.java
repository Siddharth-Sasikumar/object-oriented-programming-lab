import java.util.Scanner;      
import java.net.URL;           
import java.io.BufferedReader; 
import java.io.InputStreamReader; 

public class builtinpackage2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a website URL (e.g., https://www.example.com):");
        String urlString = scanner.nextLine();
        System.out.println("Enter a keyword to search:");
        String keyword = scanner.nextLine();

        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                int index = 0;
                while ((index = line.indexOf(keyword, index)) != -1) {
                    count++;
                    index += keyword.length();
                }
            }
            reader.close();
            System.out.println("The keyword \"" + keyword + "\" appeared " + count + " times.");
        } catch (Exception e) {
            System.out.println("Unable to fetch or search the URL content.");
        }

        scanner.close();
    }
}

