import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Example2 {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("Hello");//Thêm
        queue.offer("ban");//Thêm
        queue.remove();//Lấy và xóa phaan tư dau
        queue.poll();// Lấy và xóa
        queue.peek();//Xem phần tử đầu
        queue.element(); //
        //Hàng đợi 2 đầu
        LinkedList<String> link= new LinkedList<>();
        link.addFirst("Apple");
        link.getFirst();

    }
}
