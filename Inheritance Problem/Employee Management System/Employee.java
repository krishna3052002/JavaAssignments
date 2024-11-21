// Employee.java
public abstract class Employee {
    private String name;
    private int employeeID;

    // Constructor
    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
    }
}
