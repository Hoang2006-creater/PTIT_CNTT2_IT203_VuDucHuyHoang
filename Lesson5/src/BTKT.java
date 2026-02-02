import java.util.Scanner;
import java.util.regex.Pattern;

public class BTKT {
    public static final int MAX = 100;

    // Mảng lưu MSSV
    public static String[] studentIds = new String[MAX];

    // Số lượng hiện tại
    public static int count = 0;

    // Regex kiểm tra MSSV
    public static final String MSSV_REGEX = "^B\\d{7}$";

    public static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        int choice;
        do{
            System.out.println("\n Quản lý MSSV");
            System.out.println("1.Thêm mới mssv");
            System.out.println("2.Hiển thị MSSV");
            System.out.println("3.Xóa MSSV");
            System.out.println("4.Tìm kiếm MSSV ");
            System.out.println("5.Thoat");
            System.out.println("Moi ban nhap lua chon cua ban");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    addStudent();

                    break;
                case 2:
                    displayList();
                    break;
                case 3:
                    deleteStudentId();
                    break;
                case 4:
                    searchStudentId();
                    break;
                case 5:
                System.out.println("Thoat chuong trinh thanh cong");
                    break;
                default:
                 System.out.println("Mời bạn nhập lại lựa chọn");
                 break;
            }
        }while (choice !=5);
    }
    public static void displayList(){
        if (count == 0){
            System.out.println("Mang dang rong");
            return;
        }
        System.out.println("Bảng MSSV: ");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-5d %-10s\n", i + 1, studentIds[i]);
        }
    }

    public static boolean isValidMssv(String mssv) {
        return Pattern.matches(MSSV_REGEX, mssv);
    }

    public static void addStudent(){
        if(count>=MAX){
            System.out.println("Mang da day khong the them");
            return;
        }
        String newId;
        while (true){
            System.out.println("Nhap ma so sinh vien ");
            newId = scanner.nextLine();

            if (isValidMssv(newId)){
                break;
            }else {
                System.out.println("Ma dinh dang sai.Moi nhap lại");
            }
        }
        studentIds[count]=newId;
        count++;
        System.out.println("Them ma sinh vien thanh cong");
    }

    // Xóa MSSV
    public static void deleteStudentId() {
        if (count == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }

        System.out.print("Nhap MSSV can xoa: ");
        String target = scanner.nextLine();

        int pos = -1;
        for (int i = 0; i < count; i++) {
            if (studentIds[i].equalsIgnoreCase(target)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Khong tim thay MSSV");
            return;
        }

        // Dồn
        for (int i = pos; i < count - 1; i++) {
            studentIds[i] = studentIds[i + 1];
        }

        studentIds[count - 1] = null;
        count--;

        System.out.println("Xoa thanh cong");
    }
    // Tìm kiếm
    public static void searchStudentId() {
        if (count == 0) {
            System.out.println("Danh sach rong");
            return;
        }

        System.out.print("Nhap chuoi can tim: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;

        System.out.println("Ket qua tim kiem:");
        for (int i = 0; i < count; i++) {
            if (studentIds[i].toLowerCase().contains(keyword)) {
                System.out.println("STT " + (i + 1) + ": " + studentIds[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong có MSSV phù hợp");
        }
    }


}
