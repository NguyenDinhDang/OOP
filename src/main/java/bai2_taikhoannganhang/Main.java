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
