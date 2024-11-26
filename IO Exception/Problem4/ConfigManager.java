import java.io.*;
import java.util.*;

public class ConfigManager {
    public static void main(String[] args) {
        String configFilePath = "config.properties";
        Properties properties = new Properties();

        // Load the properties file
        try (FileInputStream fis = new FileInputStream(configFilePath)) {
            properties.load(fis);
            System.out.println("Configuration loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Configuration file not found. Creating a new one.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the configuration file.");
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nConfiguration Menu:");
            System.out.println("1. View Configuration");
            System.out.println("2. Update Configuration");
            System.out.println("3. Save and Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    viewConfiguration(properties);
                    break;
                case 2:
                    updateConfiguration(properties, scanner);
                    break;
                case 3:
                    saveConfiguration(properties, configFilePath);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    // Method to view the current configuration
    private static void viewConfiguration(Properties properties) {
        System.out.println("\nCurrent Configuration:");
        for (String key : properties.stringPropertyNames()) {
            System.out.println(key + " = " + properties.getProperty(key));
        }
    }

    // Method to update a configuration value
    private static void updateConfiguration(Properties properties, Scanner scanner) {
        System.out.print("\nEnter the key to update: ");
        String key = scanner.nextLine();
        if (properties.containsKey(key)) {
            System.out.print("Enter the new value for " + key + ": ");
            String newValue = scanner.nextLine();
            properties.setProperty(key, newValue);
            System.out.println("Configuration updated successfully.");
        } else {
            System.out.println("Key not found in the configuration. Do you want to add it? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.print("Enter the value for " + key + ": ");
                String value = scanner.nextLine();
                properties.setProperty(key, value);
                System.out.println("New configuration added successfully.");
            }
        }
    }

    // Method to save the configuration to the file
    private static void saveConfiguration(Properties properties, String configFilePath) {
        try (FileOutputStream fos = new FileOutputStream(configFilePath)) {
            properties.store(fos, "Updated Configuration File");
            System.out.println("Configuration saved to file: " + configFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the configuration file.");
            e.printStackTrace();
        }
    }
}
