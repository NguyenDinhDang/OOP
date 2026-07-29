public abstract class Human {
    public String name;
    public int age;
    public String gender;

    // Public cho phép truy cập từ bất kỳ đâu
    public void Eat() {
        System.out.println("An ba to com");
    }
    // Private chỉ cho phép truy cập trong cùng lớp
    private void Sleep() {
        System.out.println("Chong iu ngu ngon");
    }
    // Protected cho phép truy cập trong cùng gói và các lớp con
    protected void Work() {
        System.out.println("Chong iu di lam zui ze");
    }
    // Phương thức trừu tượng (abstract method) không có phần thân, lớp con phải ghi đè phương thức này
    public abstract void Keu();
}
