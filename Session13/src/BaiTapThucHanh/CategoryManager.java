package BaiTapThucHanh;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements IManager<Category> {

    private List<Category> categories = new ArrayList<>();

    @Override
    public void add(Category item) {
        categories.add(item);
        System.out.println("Thêm danh mục thành công!");
    }

    @Override
    public void update(Category item) {
        for (Category c : categories) {
            if (c.getId() == item.getId()) {
                c.setName(item.getName());
                c.setDescription(item.getDescription());
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy ID!");
    }

    @Override
    public void delete(int id) {
        for (Category c : categories) {
            if (c.getId() == id) {
                categories.remove(c);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("ID không tồn tại!");
    }

    @Override
    public void displayAll() {
        if (categories.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (Category c : categories) {
            c.displayData();
        }
    }
}