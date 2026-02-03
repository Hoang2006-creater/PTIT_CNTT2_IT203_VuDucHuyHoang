package ThucHanh;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Sắp xếp theo DTB");
            System.out.println("6. Thống kê");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Mã SV: ");
                    String ma = sc.nextLine();
                    System.out.print("Họ tên: ");
                    String ten = sc.nextLine();
                    System.out.print("Tuổi: ");
                    int tuoi = Integer.parseInt(sc.nextLine());
                    System.out.print("Giới tính: ");
                    String gt = sc.nextLine();
                    System.out.print("Toán: ");
                    double toan = Double.parseDouble(sc.nextLine());
                    System.out.print("Lý: ");
                    double ly = Double.parseDouble(sc.nextLine());
                    System.out.print("Hóa: ");
                    double hoa = Double.parseDouble(sc.nextLine());

                    Student s = new Student(ma, ten, tuoi, gt, toan, ly, hoa);
                    System.out.println(manager.addStudent(s)
                            ? " Thêm thành công"
                            : " Thêm thất bại");
                    break;

                case 2:
                    manager.showAll();
                    break;

                case 3:
                    System.out.print("Nhập mã hoặc tên: ");
                    manager.search(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Nhập mã cần xóa: ");
                    System.out.println(manager.delete(sc.nextLine())
                            ? " Đã xóa"
                            : " Không tìm thấy");
                    break;

                case 5:
                    manager.sortByDTB();
                    System.out.println("Đã sắp xếp");
                    break;

                case 6:
                    manager.thongKe();
                    break;
            }
        } while (choice != 7);
    }
}
