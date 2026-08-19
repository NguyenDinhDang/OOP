package bai4_Library;

public class Document {
    private int idDocument;
    private final String nameDocument;

    public Document(int idDocument, String nameDocument) {
        this.idDocument = idDocument;
        this.nameDocument = nameDocument;
    }

    public Document(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public void showInfoDocument() {
        System.out.println("ID Document: " + idDocument);
        System.out.println("Name Document: " + nameDocument);
    }


}
