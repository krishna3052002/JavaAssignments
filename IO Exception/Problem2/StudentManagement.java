import java.io.*;
import java.util.*;
public class StudentManagement {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path of the CSV file (e.g., students.csv): ");
        String filePath = scanner.nextLine();

        // Load student records from the CSV file
        loadStudentsFromCSV(filePath);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. View All Students");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewAllStudents();
                    break;
                case 2:
                    searchStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    deleteStudent(scanner);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }

    private static void loadStudentsFromCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    int rollNumber = Integer.parseInt(parts[1].trim());
                    double marks = Double.parseDouble(parts[2].trim());
                    students.add(new Student(name, rollNumber, marks));
                }
            }
            System.out.println("Students loaded successfully from the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("Student Records:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter roll number to search: ");
        int rollNumber = scanner.nextInt();
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                System.out.println("Student Found: " + student);
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    private static void updateStudent(Scanner scanner) {
        System.out.print("Enter roll number to update: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (Student student : students) {
            if (student.rollNumber == rollNumber) {
                System.out.print("Enter new name: ");
                student.name = scanner.nextLine();
                System.out.print("Enter new marks: ");
                student.marks = scanner.nextDouble();
                System.out.println("Student record updated successfully.");
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.print("Enter roll number to delete: ");
        int rollNumber = scanner.nextInt();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.rollNumber == rollNumber) {
                iterator.remove();
                System.out.println("Student record deleted successfully.");
                return;
            }
        }
        System.out.println("Student with roll number " + rollNumber + " not found.");
    }
}
