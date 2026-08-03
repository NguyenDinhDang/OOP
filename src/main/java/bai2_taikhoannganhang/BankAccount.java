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
