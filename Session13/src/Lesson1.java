import java.util.ArrayList;
import java.util.Iterator;

public class Lesson1 {
    public static void main(String[] args) {
        ArrayList<Double> temperatures  =new ArrayList<>();

        temperatures.add(36.5);
        temperatures.add(40.2);
        temperatures.add(37.0);
        temperatures.add(12.5);
        temperatures.add(39.8);
        temperatures.add(99.9);
        temperatures.add(36.8);

        Iterator<Double> iterator =temperatures.iterator();

        while (iterator.hasNext()){
        Double temp = iterator.next();
        if(temp<34.0 || temp >42.0){
            iterator.remove();
        }
        }
        double sum = 0;
        for(Double temp:temperatures){
            sum+=temp;
        }

        double average = 0;
        if(!temperatures.isEmpty()){
            average= sum/temperatures.size();
        }
        System.out.println("Danh sach hop le: " +temperatures);
        System.out.println("Nhiet do trung binh: "+ average);
    }
}
