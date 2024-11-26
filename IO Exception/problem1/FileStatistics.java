import java.io.*;

public class FileStatistics {
    public static void main(String[] args) {
        // Specify the file path here
        
        String filePath = "example.txt";
        
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++; // Count lines
                charCount += line.length(); // Count characters (excluding line breaks)
                
                // Count words in the line
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            
            // Display the results
            System.out.println("File Statistics:");
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);
            
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
