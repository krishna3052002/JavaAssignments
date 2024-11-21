// Main.java
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Adding employees
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 101, 5000);
        manager.addEmployee(fullTimeEmployee);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 102, 20, 120);
        manager.addEmployee(partTimeEmployee);

        ContractEmployee contractEmployee = new ContractEmployee("Alice Brown", 103, 6, 30000);
        manager.addEmployee(contractEmployee);

        // Display all employees
        System.out.println("Employee Details:");
        manager.displayAllEmployees();

        // Calculate and display total salary
        System.out.println("Total Salary of All Employees: " + manager.calculateTotalSalaries());

        // Remove an employee
        System.out.println("Removing Employee with ID 102...");
        manager.removeEmployee(102);

        // Display all employees again
        System.out.println("Updated Employee Details:");
        manager.displayAllEmployees();

        // Display total salary again
        System.out.println("Updated Total Salary: " + manager.calculateTotalSalaries());
    }
}
