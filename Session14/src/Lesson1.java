import java.util.LinkedHashSet;
import java.util.Set;

public class Lesson1 {
    public static void main(String[] args) {
        String[] input = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };
        Set<String> danhSach = new LinkedHashSet<>();

        for(String name :input){
            danhSach.add(name);
        }
        System.out.println("Danh sach goi kham");
        for(String name:danhSach){
            System.out.println(name);
        }
    }
}
