package bai5_employeemanagement;

public class SalaryEmployee extends Employee {
    private double monthlySalary;

    public SalaryEmployee(String name, int employeeID, double monthlySalary) {
        super(name, employeeID);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Total Salary: " + calculateSalary());
    }
}