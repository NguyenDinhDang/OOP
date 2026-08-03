package bai1_quanlydongvat;

public abstract class DongVat {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void makeSound();
    
    public void sleep () {
        System.out.println("Dong vat dang ngu");
    }
}
