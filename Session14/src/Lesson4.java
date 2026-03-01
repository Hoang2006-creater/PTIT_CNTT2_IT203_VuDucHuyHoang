import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Lesson4 {
    public static void main(String[] args) {
        List<String> danhSach = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết");
        Map<String,Integer> thongKe = new TreeMap<>();

        for(String benh :danhSach){
            if (thongKe.containsKey(benh)) {
                thongKe.put(benh, thongKe.get(benh) + 1);
            } else {
                thongKe.put(benh, 1);
            }
        }

        // In báo cáo
        System.out.println("Bao cao ca benh trong ngay :");
        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}