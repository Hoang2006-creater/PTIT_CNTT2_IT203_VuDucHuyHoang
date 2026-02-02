import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa toán lớp 12, Kệ: A1-102, tình trạng mới";
        int pos = description.indexOf("Kệ:");
        String after = description.substring(pos+3);
        int commaPos = after.indexOf(",");
        String location;
        location = after.substring(0, commaPos).trim();
        String newDesc=
                description.substring(0,pos)
                + "Vị trí luu trữ: "
                +description.substring(pos+3);
        System.out.println("Mã vị trí: " + location);
        System.out.println("Mô tả mới: " + newDesc);
    }
}