## OOP - Ghi thong tin
# OOP (Object-Oriented Programming) là một phương pháp lập trình dựa trên khái niệm "đối tượng" (object), nơi dữ liệu và các phương thức được gói gọn trong các đối tượng. Trong OOP, việc ghi thông tin thường liên quan đến việc tạo ra các lớp (class) và đối tượng (object) để lưu trữ và quản lý dữ liệu.

## Kế thừa 
lớp con extend lớp cha 
vd: Sinhvien extend Humman

## Đóng gói
| Modifier    | Trong class | Cùng package | Class kế thừa | Mọi nơi |
| ----------- | :---------: | :----------: | :-----------: | :-----: |
| `private`   |      ✅      |       ❌      |       ❌       |    ❌    |
| `protected` |      ✅      |       ✅      |       ✅       |    ❌    |
| `public`    |      ✅      |       ✅      |       ✅       |    ✅    |

public giống phòng khách - ai cũng vào được
private giống phòng ngủ chỉ chủ nhà mới vào được 
protected là phòng dành cho người trong gia đình, chính class đó, class kế thừa, trong cùng package mới truy cập được 

## Đa hình
Có nghĩa là nhiều hình thái hoạt động trên cùng 1 phương thức 
# ghi đè phương thức (overriding)
Lớp con định nghĩa lại phương thức lớp cha 

# nạp chồng phương thức (overloading)
Trong cùng 1 phương thức nhưng sẽ khác nhau về nội dung truyền vào nó cũng sẽ thay đổi tuỳ vào biến truyền vào

## Trừu tượng 
1 phương thức được khai báo nhưng không nêu tên hay định nghĩa gì thì nó là một phương thức trừu tượng

Nó không tạo ra object nào cả mà nó chỉ tạo ra 1 khuông mẫu để các lớp khác kế thừa theo 

# khai báo: public abstract class dongVat () {}

# interface
# Khai báo: public interface dongVat(){}
interface mặc định là 1 lớp trừu tượng, không thể khai báo các thuộc tính chung chung mà phải gán cụ thể 
vd:  public interface DongVat(){
    String name = "Nguyen Hoai Khang";
    int age = 36;
    String nickname = "Tuất";
}
các class con khi dùng interface: public dongVat implement DongVat
khi bất kì lớp con nào kế thừa lớp cha interface sẽ mặc định mang giá trị của interface 