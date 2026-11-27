package THLop;

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

}
