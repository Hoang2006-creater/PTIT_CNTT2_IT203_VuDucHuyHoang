public class Book {
    private String bookId;
    private String bookName;
    private String author;
    private double price;

    public Book(String bookId, String bookName, String author, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá: " + price);
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("B001", "Lập trình Java", "Nguyễn Văn A", 120000);
        Book b2 = new Book("B002", "Cấu trúc dữ liệu", "Trần Văn B", 150000);

        b1.displayInfo();
        b2.displayInfo();
    }
}
