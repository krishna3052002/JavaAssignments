// EmployeeManager.java
import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees;

    // Constructor
    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    // Remove an employee by ID
    public void removeEmployee(int employeeID) {
        for (Employee employee : employees) {
            if (employee instanceof Employee && ((Employee) employee).employeeID == employeeID) {
                employees.remove(employee);
                System.out.println("Employee removed successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Display all employees
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("-----");
        }
    }

    // Calculate total salary of all employees
    public double calculateTotalSalaries() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.calculateSalary();
        }
        return total;
    }
}
