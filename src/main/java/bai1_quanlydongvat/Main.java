package bai1_quanlydongvat;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Dog và gọi các phương thức của nó
        Dog dog = new Dog();
        dog.setName("Cho co");
        dog.setAge(3);
        
        // Tạo đối tượng Cat và gọi các phương thức của nó
        Cat cat = new Cat();
        cat.setName("Meo muop");
        cat.setAge(2);
        // Tính đa hình
        DongVat[] animals = {dog, cat}; // Tạo mảng các đối tượng Animal cat và dog

        for (DongVat animal : animals) { // Duyệt qua từng đối tượng trong mảng và gọi các phương thức của nó
            // ở lần lặp đầu tiên, animal sẽ là dog, ở lần lặp thứ hai, animal sẽ là cat
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            animal.makeSound();
            animal.sleep();
        }
    }
}
