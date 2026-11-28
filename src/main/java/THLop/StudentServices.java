package THLop;
import java.util.Scanner;

public class StudentServices {

    public void displayStudentInfo(Student student) {
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }

    public void displayAllStudents(Student[] students) {
        for (Student student : students) {
            displayStudentInfo(student);
            System.out.println();
        }
    }

    public void printStudentById(Student[] students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                displayStudentInfo(student);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ID: " + id);
    }

    public void printStudentWithIdGreaterThan(Student[] students, int id) {
        boolean found = false;
        for (Student student : students) {
            if(student.getId() < id) {
                displayStudentInfo(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien voi ID <" + " " + id);
        }
    }

    public void createStudent(int n) {
        Scanner scanner = new Scanner(System.in);
        Student student[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Nhap ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Nhap Ten: ");
            String name = scanner.nextLine();
            System.out.print("Nhap Tuoi: ");
            int age = scanner.nextInt();
            student[i] = new Student(id, name, age);
        }
        scanner.close();
    }

}
