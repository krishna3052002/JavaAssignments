// PartTimeEmployee.java
public class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, int employeeID, double hourlyWage, int hoursWorked) {
        super(name, employeeID);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

    // Override displayDetails
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
