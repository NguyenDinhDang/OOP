public class Sinhvien {
    // Thuộc tính
    public String name;
    public int age;
    public String major;
    // Phương thức 
    public void setInfo(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }
}
