import java.util.*;

public class Lesson3 {

    // Phương thức Generic tìm phần tử chung
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();

        for (T item : listA) {
            if (listB.contains(item) && !result.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }
        // Trường hợp 1 ;Integer
    public static void main(String[] args) {

        List<Integer> khoaNoi_ID = Arrays.asList(101, 102, 105);
        List<Integer> khoaNgoai_ID = Arrays.asList(102, 105, 108);

        List<Integer> commonIDs = findCommonPatients(khoaNoi_ID, khoaNgoai_ID);

        System.out.println("Bệnh nhân khám cả 2 khoa (Integer): " + commonIDs);


        // Trường hợp 2: String
        List<String> khoaNoi_BHYT = Arrays.asList("DN01", "DN02", "DN03");
        List<String> khoaNgoai_BHYT = Arrays.asList("DN02", "DN04");

        List<String> commonBHYT = findCommonPatients(khoaNoi_BHYT, khoaNgoai_BHYT);

        System.out.println("Bệnh nhân khám cả 2 khoa (String): " + commonBHYT);
    }
}