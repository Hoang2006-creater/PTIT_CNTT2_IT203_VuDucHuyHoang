package Lesson5;

import Lesson2.Patient;

import java.util.Stack;

public class EmergencyCase {

    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    // Thêm bước xử lý (PUSH)
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Da them buoc: " + step);
    }

    // Undo bước gần nhất (POP)
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Khong co buoc nao de undo!");
            return null;
        }
        TreatmentStep removed = steps.pop();
        System.out.println("Da undo: " + removed);
        return removed;
    }

    // Hiển thị các bước (gần nhất trước)
    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chua co buoc xu ly.");
            return;
        }

        System.out.println("=== Cac buoc xu ly (Gan nhat truoc) ===");
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println(steps.get(i));
        }
    }
}