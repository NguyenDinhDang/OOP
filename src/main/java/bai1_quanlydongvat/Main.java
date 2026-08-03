package bai1_quanlydongvat;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Dog và gọi các phương thức của nó
        Dog dog = new Dog();
        dog.setName("Cho co");
        dog.setAge(3);
        
        System.out.println("name: " + dog.getName());
        System.out.println("age: " + dog.getAge());
        dog.makeSound();
        dog.sleep();
        
        // Tạo đối tượng Cat và gọi các phương thức của nó
        Cat cat = new Cat();
        cat.setName("Meo muop");
        cat.setAge(2);
       
        // Gọi các phương thức của đối tượng cat
        System.out.println("name: " + cat.getName());
        System.out.println("age: " + cat.getAge()); 
        cat.makeSound();
        cat.sleep();
    }
}
