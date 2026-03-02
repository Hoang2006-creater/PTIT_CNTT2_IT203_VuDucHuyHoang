package Lesson1;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();
        history.addEdit(new EditAction("Cap nhat chan doan", "09:00"));
        history.addEdit(new EditAction("Them ket qua xet nghiem", "09:15"));
        history.addEdit(new EditAction("Sua don thuoc", "09:30"));
        history.displayHistory();
        System.out.println("Chinh sua gan nhat: "+history.getLastestEdit());
        history.undoEdit();
        history.displayHistory();
    }
}
