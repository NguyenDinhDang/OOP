package bai5_employeemanagement;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new HourlySalary("John Doe", 12345, 20.0, 40);
        Employee emp2 = new SalaryEmployee("Jane Smith", 67890, 5000.0);

        emp1.displayInfo();
        emp2.displayInfo();
    }
}