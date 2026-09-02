package bai5_employeemanagement;

public class HourlySalary extends Employee {
    private double Wage;
    private int hoursWorked;

    public HourlySalary(String name, int employeeID, double Wage, int hoursWorked) {
        super(name, employeeID); // super là gọi constructor của lớp cha (Employee) để khởi tạo các thuộc tính name và employeeID
        this.Wage = Wage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return Wage * hoursWorked;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wage: " + Wage);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}