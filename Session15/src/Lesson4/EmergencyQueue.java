package Lesson4;

import java.util.PriorityQueue;

public class EmergencyQueue {

    private int counter = 0;

    private PriorityQueue<EmergencyPatient> queue =
            new PriorityQueue<>(
                    (p1, p2) -> {
                        if (p1.getPriority() != p2.getPriority()) {
                            return p1.getPriority() - p2.getPriority();
                        }
                        return p1.getArrivalOrder() - p2.getArrivalOrder();
                    }
            );

    public void addPatient(EmergencyPatient p) {
        queue.offer(p);
        System.out.println("Da them: " + p);
    }

    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Khong co benh nhan!");
            return null;
        }
        EmergencyPatient p = queue.poll();
        System.out.println("Dang kham: " + p);
        return p;
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hang doi rong.");
            return;
        }

        System.out.println(" Danh sach cho kham ");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }

    // Tạo bệnh nhân tự tăng arrivalOrder
    public EmergencyPatient createPatient(String id, String name, int priority) {
        return new EmergencyPatient(id, name, priority, counter++);
    }
}