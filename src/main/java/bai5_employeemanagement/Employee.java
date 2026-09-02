package bai5_employeemanagement;

public abstract class Employee {
    private String name;
    private int EmployeeID;

    public abstract double calculateSalary();
    
    public Employee(String name, int employeeID) {
        this.name = name;
        this.EmployeeID = employeeID;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name); 
        System.out.println("Employee ID: " + EmployeeID);
    }


}
