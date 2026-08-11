package bai3_Car;

public class Engine {
    private int idEngine;
    private String nameEngine;
    private int HorsePower;

    public Engine (int idEngine, String nameEngine, int HorsePower) {
        this.idEngine = idEngine;
        this.nameEngine = nameEngine;
        this.HorsePower = HorsePower;
    }

    public void showInfoEngine () {
        System.out.println("ID Engine: " + idEngine);
        System.out.println("Name Engine: " + nameEngine);
        System.out.println("Horse Power: " + HorsePower);
    }

    public void startEngine () {
        System.out.println("Engine started!");
    }
}