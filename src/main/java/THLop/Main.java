package THLop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Nguyen", 20),
            new Student(2, "Khang Lốp LGBT", 22),
            new Student(3, "Khang Tran", 19),
            new Student(4, "Khang gg", 19),
            new Student(12, "Tran", 19)
        };

        // Scanner scanner = new Scanner(System.in);
        // Student student = new Student();
        // int id;
        // String name;
        // int age;
        // System.out.print("Nhap ID: ");
        // id = scanner.nextInt();
        // scanner.nextLine(); 
        // System.out.print("Nhap Ten: ");
        // name = scanner.nextLine();
        // System.out.print("Nhap Tuoi: ");
        // age = scanner.nextInt();
        // student.setId(id);
        // student.setName(name);
        // student.setAge(age);
        // System.out.println("ID: " + student.getId());
        // System.out.println("Name: " + student.getName());
        // System.out.println("Age: " + student.getAge());
        // scanner.close();

        StudentServices studentServices = new StudentServices();
        studentServices.displayAllStudents(students);
        studentServices.printStudentById(students, 8);
        studentServices.printStudentWithIdGreaterThan(students, 1);
    }
}
