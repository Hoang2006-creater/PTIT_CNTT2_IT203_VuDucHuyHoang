package Lesson2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue = new LinkedList<>();

    // Thêm bệnh nhân vào hàng đợi
    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Da them benh nhan: " + p);
    }

    // Gọi bệnh nhân tiếp theo
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Khong co benh nhan nao!");
            return null;
        }
        Patient p = queue.poll();
        System.out.println("Dang kham: " + p);
        return p;
    }

    // Xem bệnh nhân tiếp theo
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hang doi rong!");
            return null;
        }
        return queue.peek();
    }

    // Kiểm tra rỗng
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Hiển thị toàn bộ hàng đợi
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Khong co benh nhan trong hang doi.");
            return;
        }

        System.out.println(" Danh sach benh nhan dang cho ");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
