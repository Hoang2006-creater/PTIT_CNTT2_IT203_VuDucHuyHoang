import java.util.*;

public class Lesson2 {
    public static void main(String[] args) {
        List<String> medicines = Arrays.asList(
                "Paracetamol",
                "Ibuprofen",
                "Panadol",
                "Paracetamol",
                "Aspirin",
                "Ibuprofen"
        );
        Set<String>  uniqueSet = new HashSet<>(medicines);
        List<String> result = new ArrayList<>(uniqueSet);
        Collections.sort(result);

        System.out.println("Input:  " + medicines);
        System.out.println("Output: " + result);
    }
}
