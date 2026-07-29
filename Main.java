public class Main {
    public static void main(String[] args) {
        Minami_aizawa minami = new Minami_aizawa();
        minami.Speak();
        //minami.Eat();
        //minami.Work();
        // minami.Sleep(); // Lỗi: phương thức Sleep() là private và không thể truy cập từ lớp Minami_aizawa
        minami.Keu();
        Emi_Fukada emi = new Emi_Fukada();
        emi.Keu();

    }
}