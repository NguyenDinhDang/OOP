package bai4_Library;

public class PDF extends Document {
    private final Double fileSize;

    public PDF(int idDocument, String nameDocument, Double fileSize) {
        super(idDocument, nameDocument); // Gọi constructor của lớp cha Document để khởi tạo các thuộc tính idDocument và nameDocument
        this.fileSize = fileSize;
    }

    public void showInfoPDF() {
        super.showInfoDocument(); // Gọi phương thức showInfoDocument() của lớp cha Document để hiển thị thông tin idDocument và nameDocument
        System.out.println("File Size: " + fileSize + " MB");
    }
}
