import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Admin\\Desktop\\Java_Project\\File_Handling\\filehandling.txt";

        // Write to a file
        writeToFile(filePath, "Hello, this is a example text for Write function.");

        // Read from a file
        String content = readFromFile(filePath);
        System.out.println("Content read from the file:\n" + content);

        // Append to a file
        appendToFile(filePath, "\nHello, this is a example text for Append function.");

        // Read the updated content
        content = readFromFile(filePath);
        System.out.println("Updated content read from the file:\n" + content);
    }

    // Method to write to a file
    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read from a file
    private static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // Method to append to a file
    private static void appendToFile(String filePath, String contentToAppend) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(contentToAppend);
            System.out.println("Content appended to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
