public class Emi_Fukada extends Human { //Lớp Emi_Fukada kế thừa từ lớp Human
    public void Speak() {
        System.out.println("Xin chao Anhhh iuuu Nguyen");
    }
    //Ghi đè phương thức Keu() của lớp cha Human
    // public void Keu() {
    //     System.out.println("Chao anh nguyen");
    // }
    @Override // Ghi đè phương thức Keu() của lớp cha Human
    public void Keu(){
        System.out.println("Toi ten la Emi Fukada, toi rat thich anime");
    };
}
