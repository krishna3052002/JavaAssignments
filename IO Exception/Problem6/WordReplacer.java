import java.io.*;
import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Specify the file path
        String filePath = "example.txt";

        System.out.print("Enter the word to be replaced: ");
        String targetWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String replacementWord = scanner.nextLine();

        try {
            // Read the file content
            String fileContent = readFile(filePath);

            // Replace the target word with the replacement word
            String modifiedContent = fileContent.replace(targetWord, replacementWord);

            // Write the modified content back to the file
            writeFile(filePath, modifiedContent);

            System.out.println("The word \"" + targetWord + "\" has been replaced with \"" + replacementWord + "\".");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }

        scanner.close();
    }

    /**
     * Reads the content of a text file.
     *
     * @param filePath Path to the file.
     * @return The content of the file as a string.
     * @throws IOException If an I/O error occurs.
     */
    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }
        return content.toString();
    }

    /**
     * Writes content to a text file.
     *
     * @param filePath Path to the file.
     * @param content  The content to write to the file.
     * @throws IOException If an I/O error occurs.
     */
    private static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
}
