import java.io.*;

public class LineSeparator {
    public static void main(String[] args) {
        // Specify the input file path
        String inputFilePath = "largefile.txt";

        // Output files for odd and even lines
        String oddLinesFile = "odd_lines.txt";
        String evenLinesFile = "even_lines.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter oddWriter = new BufferedWriter(new FileWriter(oddLinesFile));
            BufferedWriter evenWriter = new BufferedWriter(new FileWriter(evenLinesFile))
        ) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                if (lineNumber % 2 == 0) {
                    evenWriter.write(line);
                    evenWriter.newLine();
                } else {
                    oddWriter.write(line);
                    oddWriter.newLine();
                }
                lineNumber++;
            }

            System.out.println("Lines separated successfully:");
            System.out.println("Odd lines written to: " + oddLinesFile);
            System.out.println("Even lines written to: " + evenLinesFile);

        } catch (FileNotFoundException e) {
            System.out.println("The input file was not found: " + inputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing files.");
            e.printStackTrace();
        }
    }
}
