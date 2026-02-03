package ThucHanh;

public class StudentManager {
    private Student[] students = new Student[100];
    private int count = 0;

    // Kiểm tra trùng mã
    private int findIndexByMa(String ma) {
        for (int i = 0; i < count; i++) {
            if (students[i].getMaSV().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    // Thêm sinh viên
    public boolean addStudent(Student s) {
        if (count >= students.length || findIndexByMa(s.getMaSV()) != -1)
            return false;
        students[count++] = s;
        return true;
    }

    // Hiển thị
    public void showAll() {
        System.out.printf("%-10s %-20s %-5s %-8s %-6s %-10s\n",
                "MaSV", "HoTen", "Tuoi", "GT", "DTB", "XepLoai");
        for (int i = 0; i < count; i++) {
            students[i].hienThi();
        }
    }

    // Tìm kiếm
    public void search(String key) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getMaSV().equalsIgnoreCase(key)
                    || students[i].getHoTen().toLowerCase().contains(key.toLowerCase())) {
                students[i].hienThi();
                found = true;
            }
        }
        if (!found) System.out.println(" Không tìm thấy sinh viên");
    }

    // Xóa
    public boolean delete(String ma) {
        int idx = findIndexByMa(ma);
        if (idx == -1) return false;
        for (int i = idx; i < count - 1; i++) {
            students[i] = students[i + 1];
        }
        students[--count] = null;
        return true;
    }

    // Sắp xếp theo DTB giảm dần (Bubble Sort)
    public void sortByDTB() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (students[j].getDiemTB() < students[j + 1].getDiemTB()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // Thống kê
    public void thongKe() {
        int gioi = 0, kha = 0, tb = 0, yeu = 0;
        for (int i = 0; i < count; i++) {
            switch (students[i].getXepLoai()) {
                case "Giỏi": gioi++; break;
                case "Khá": kha++; break;
                case "Trung bình": tb++; break;
                default: yeu++;
            }
        }
        System.out.println("Giỏi: " + gioi);
        System.out.println("Khá: " + kha);
        System.out.println("Trung bình: " + tb);
        System.out.println("Yếu: " + yeu);
    }
}
