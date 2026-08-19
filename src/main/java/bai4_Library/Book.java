package bai4_Library;

public class Book extends Document {
    private String author;
    private String pageCount;

    public Book(int idDocument, String nameDocument, String author, String pageCount) {
        super(idDocument, nameDocument); // Gọi constructor của lớp cha Document để khởi tạo các thuộc tính idDocument và nameDocument
        this.author = author;
        this.pageCount = pageCount;
    }
    
    public void showInfoBook() {
        super.showInfoDocument(); // Gọi phương thức showInfoDocument() của lớp cha Document để hiển thị thông tin idDocument và nameDocument
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }
    
}
