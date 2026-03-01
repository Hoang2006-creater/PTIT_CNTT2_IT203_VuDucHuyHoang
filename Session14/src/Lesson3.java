import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson3 {
    public static void main(String[] args) {
        // Set a: Thanh Phan thuoc
        Set<String> thuoc = new HashSet<>(Arrays.asList("Aspirin","Caffeine","Parcetamol"));
        Set<String> diUng = new HashSet<>(Arrays.asList("Penicillin","Aspitin"));
        Set<String> canhBao = new HashSet<>(thuoc);
        canhBao.retainAll(diUng);
        Set<String> anToan = new HashSet<>(thuoc);
        anToan.removeAll(diUng);
        System.out.println("Cảnh báo dị ứng: " + canhBao);
        System.out.println("Thành phần an toàn: " + anToan);
    }
}
