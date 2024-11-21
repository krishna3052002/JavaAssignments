// ContractEmployee.java
public class ContractEmployee extends Employee {
    private int projectDuration; // in months
    private double projectFee;

    // Constructor
    public ContractEmployee(String name, int employeeID, int projectDuration, double projectFee) {
        super(name, employeeID);
        this.projectDuration = projectDuration;
        this.projectFee = projectFee;
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        return projectFee; // Total salary is the project fee
    }

    // Override displayDetails
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Project Duration: " + projectDuration + " months");
        System.out.println("Project Fee: " + projectFee);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
