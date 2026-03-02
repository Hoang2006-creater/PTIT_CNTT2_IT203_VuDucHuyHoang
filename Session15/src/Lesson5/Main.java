package Lesson5;

import Lesson2.Patient;

public class Main {
    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        // Tạo bệnh nhân
        Patient p1 = new Patient("BN01", "Nguyen Van A", 30);
        Patient p2 = new Patient("BN02", "Tran Thi B", 25);

        // Tạo ca cấp cứu
        EmergencyCase case1 = new EmergencyCase(p1);
        EmergencyCase case2 = new EmergencyCase(p2);

        // Thêm vào Queue
        queue.addCase(case1);
        queue.addCase(case2);

        // Lấy ca đầu tiên để xử lý
        EmergencyCase current = queue.getNextCase();

        // Thêm các bước xử lý (Stack)
        current.addStep(new TreatmentStep("Tiep nhan", "09:00"));
        current.addStep(new TreatmentStep("Chan doan", "09:05"));
        current.addStep(new TreatmentStep("Dieu tri", "09:15"));

        current.displaySteps();

        // Undo bước gần nhất
        System.out.println("\nCo sai sot -> Undo");
        current.undoStep();

        current.displaySteps();
    }
}