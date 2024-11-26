import java.io.*;
import java.util.Scanner;

public class BinaryFileHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and output file paths
        String inputFilePath = "input.bin";
        String outputFilePath = "output.bin";

        // Read and copy the binary file
        try {
            copyBinaryFile(inputFilePath, outputFilePath);
            System.out.println("File copied successfully from " + inputFilePath + " to " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred during file copying.");
            e.printStackTrace();
        }

        // Ask the user if they want to append data
        System.out.print("\nDo you want to append data to the binary file? (yes/no): ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter the data to append (in plain text): ");
            String dataToAppend = scanner.nextLine();

            try {
                appendDataToBinaryFile(inputFilePath, dataToAppend);
                System.out.println("Data appended successfully to " + inputFilePath);
            } catch (IOException e) {
                System.out.println("An error occurred while appending data to the file.");
                e.printStackTrace();
            }
        }

        scanner.close();
    }

    /**
     * Copies a binary file from the source to the destination.
     *
     * @param sourceFilePath Path of the source file.
     * @param destinationFilePath Path of the destination file.
     * @throws IOException If an I/O error occurs.
     */
    private static void copyBinaryFile(String sourceFilePath, String destinationFilePath) throws IOException {
        try (
            FileInputStream inputStream = new FileInputStream(sourceFilePath);
            FileOutputStream outputStream = new FileOutputStream(destinationFilePath)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }

    /**
     * Appends data to the end of a binary file.
     *
     * @param filePath Path of the file to append data to.
     * @param data Data to append as bytes.
     * @throws IOException If an I/O error occurs.
     */
    private static void appendDataToBinaryFile(String filePath, String data) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(filePath, true)) {
            byte[] dataBytes = data.getBytes(); // Convert the string to bytes
            outputStream.write(dataBytes);
        }
    }
}
