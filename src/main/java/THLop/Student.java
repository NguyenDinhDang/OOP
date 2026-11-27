package THLop;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student (int id, String name, int age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    public Student() {
        
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID phai lon hon 0");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name == "") {
            throw new IllegalArgumentException("Ten khong duoc de trong");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("tuoi phai lon hon 0");
        }
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
