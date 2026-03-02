package Lesson5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases = new LinkedList<>();

    // Thêm ca cấp cứu (FIFO)
    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Da tiep nhan: " + c.getPatient().getName());
    }

    // Lấy ca tiếp theo
    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Khong con benh nhan!");
            return null;
        }
        EmergencyCase c = cases.poll();
        System.out.println("Dang xu ly: " + c.getPatient().getName());
        return c;
    }
}