# Tổng hợp Source Code

Dưới đây là toàn bộ mã nguồn của 2 thư mục trong dự án.

---

## Folder: `bai1_quanlydongvat`

### File: `DongVat.java`

```java
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
```

### File: `Cat.java`

```java
package bai1_quanlydongvat;

public class Cat extends DongVat {
    @Override
    public void makeSound() {
        System.out.println("Meooooo meo!");
    }
}
```

### File: `Dog.java`

```java
package bai1_quanlydongvat;

public class Dog extends DongVat {
    @Override
    public void makeSound() {
        System.out.println("Gau gau!");
    }
    
}
```

### File: `Main.java`

```java
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
```

---

## Folder: `bai2_taikhoannganhang`

### File: `BankAccount.java`

```java
package bai2_taikhoannganhang;

public class BankAccount {
    private String accountNumber;
    private String userName;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    public double getBalance() {
        return balance;
    }   

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }
    public void showAccountInfo() {
        System.out.println("So tai khoan: " + accountNumber);
        System.out.println("Ten chu tai khoan: " + userName);
        System.out.println("So du: " + balance);
    }
}
```

### File: `Main.java`

```java
package bai2_taikhoannganhang;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        account1.setAccountNumber("0989234567");
        account1.setUserName("Dang Dinh Nguyen");
        account1.deposit(99999999.99);
        account1.showAccountInfo();
    }
}
```
