package bai4_Library;

public class Main {
    DocumentManager documentManager = new DocumentManager();
    Book book1 = new Book(1, "Java Programming", "Dang Dinh Nguyen", "350");
    Book book2 = new Book(2, "Python Programming", "MR EnderDragonVN", "400");
    PDF pdf1 = new PDF(3, "Java Shit", 2.5);

    public void run() {
        documentManager.addDocument(book1);
        documentManager.addDocument(book2);
        documentManager.addDocument(pdf1);

        documentManager.showAllDocuments();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
