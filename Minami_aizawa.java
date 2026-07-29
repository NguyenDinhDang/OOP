public class Minami_aizawa extends Human { //Lớp minami_aizawa kế thừa từ lớp Human
    public void Speak() {
        System.out.println("Xin chao chong iuu da ve nha");
    }
    // Nạp chồng phương thức Eat() từ lớp cha Human
    public void Keu(String message) {
        System.out.println(message);
    }
    @Override
    public void Keu() {
        System.out.println("Toi ten la Minami Aizawa, toi rat thich anime");
    }
}