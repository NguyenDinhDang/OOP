package bai4_Library;

import java.util.ArrayList;

public class DocumentManager {
    ArrayList<Document> documents = new ArrayList<>();

    public void addDocument(Document document) {
        documents.add(document);
    }

    public void showAllDocuments() {
        for (Document document : documents) { // Duyệt qua từng đối tượng Document trong danh sách documents
            switch (document) {
                case PDF pdf -> // Kiểm tra xem đối tượng document có phải là một thể hiện của lớp PDF hay không
                    pdf.showInfoPDF(); // Nếu đúng, gọi phương thức showInfoPDF() của đối tượng PDF để hiển thị thông tin của nó
                case Book book -> // Kiểm tra xem đối tượng document có phải là một thể hiện của lớp Book hay không
                    book.showInfoBook(); // Nếu đúng, gọi phương thức showInfoBook() của đối tượng Book để hiển thị thông tin của nó
                default -> {
                }
            }
            System.out.println("--------------------");
        }
    }
}
