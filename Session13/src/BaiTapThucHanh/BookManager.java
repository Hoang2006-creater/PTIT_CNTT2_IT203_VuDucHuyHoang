package BaiTapThucHanh;

import java.util.ArrayList;
import java.util.List;

public class BookManager implements IManager<Book> {

    private List<Book> books = new ArrayList<>();

    @Override
    public void add(Book item) {
        books.add(item);
        System.out.println("Thêm sách thành công!");
    }

    @Override
    public void update(Book item) {
        for (Book b : books) {
            if (b.getId() == item.getId()) {
                b.setTitle(item.getTitle());
                b.setAuthor(item.getAuthor());
                b.setCategoryId(item.getCategoryId());
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy ID!");
    }

    @Override
    public void delete(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("ID không tồn tại!");
    }

    @Override
    public void displayAll() {
        if (books.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (Book b : books) {
            b.displayData();
        }
    }
}
