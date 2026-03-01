import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Map<String,String> danhMuc = new HashMap<>();

        // Them 5 loai thuoc
        danhMuc.put("T01", "Paracetamol");
        danhMuc.put("T02", "Ibuprofen");
        danhMuc.put("T03", "Aspirin");
        danhMuc.put("T04", "Amoxicillin");
        danhMuc.put("T05", "Vitamin C");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma thuoc");
        String maThuoc = sc.nextLine();
        if (danhMuc.containsKey(maThuoc)){
            System.out.println("Tên thuốc: " + danhMuc.get(maThuoc));
        } else {
            System.out.println("Thuốc không tồn tại.");
        }
    }
}
