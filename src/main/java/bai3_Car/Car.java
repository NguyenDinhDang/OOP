package bai3_Car;

public class Car {
    private int idCar;
    private String nameCar;
    private Engine engine;
    private Lop lop;

    public Car(int idCar, String nameCar, Engine engine, Lop lop) {

        this.idCar = idCar;
        this.nameCar = nameCar;
        this.engine = engine;
        this.lop = lop;
    }

    public Car(int idCar, String nameCar) {
        this(idCar, nameCar, // Khởi tạo đối tượng Engine và Lop mặc định 
        new Engine(1, "V8", 300), //this này là gọi đến constructor của lớp Car với các tham số idCar, nameCar, một đối tượng Engine mới và một đối tượng Lop mới. Cụ thể, nó tạo ra một đối tượng Engine với idEngine là 1, nameEngine là "V8" và HorsePower là 300, và một đối tượng Lop với idLop là 1, nameLop là "Nguyen Hoai Khang" và doBenLop là "Vo Han".
        new Lop(1, "Nguyen Hoai Khang", "Vo Han"));
    }


    public void showInfoCar() {
        System.out.println("ID Car: " + idCar);
        System.out.println("Name Car: " + nameCar);
        engine.showInfoEngine();
        lop.showInfoLop();
    }

    public void startCar() {
        engine.startEngine();
        lop.startLop();
        System.out.println("Car started!");
    }
}
