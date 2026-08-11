package bai3_Car;

public class Lop {
    private int idLop;
    private String nameLop;
    private String doBenLop;

    public Lop(int idLop, String nameLop, String doBenLop) {
        this.idLop = idLop;
        this.nameLop = nameLop;
        this.doBenLop = doBenLop;
    }

    public void showInfoLop() {
        System.out.println("ID Lop: " + idLop);
        System.out.println("Ten Lop: " + nameLop);
        System.out.println("Do Ben Lop: " + doBenLop);
    }

    public void startLop() { //Khởi động lốp xe 
        System.out.println("Hoai Khang den dayyyyyyyy");
    }
}
