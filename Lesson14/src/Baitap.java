import java.util.*;

public class Baitap {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<100;i++){
            list.add(random.nextInt(1000));
        }

        System.out.println("Danh sach ban dau");
        System.out.println(list);

        // Dem so lan xuat hien cua tung phan tu
        Map<Integer,Integer> countMap = new HashMap<>();
        for(Integer num:list){
            countMap.put(num,countMap.getOrDefault(num,0)+1);
            System.out.println("So lan xuat hien cua tung phan tu:");
            
            for(Map.Entry<Integer,Integer> entry:countMap.entrySet()){
                System.out.println(entry.getKey()+"xuat hien"+entry.getValue()+"Lan");
                Set<Integer> uniqueSet = new HashSet<>(list);
                System.out.println("Danh sach sau khi loai bo trung lap: ");
                System.out.println(uniqueSet);
            }
        }
    }
}
