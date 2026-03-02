package Lesson2;

public class Main {
    public static void main(String[] args) {
        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("BN01", "Nguyen Van A", 30));
        pq.addPatient(new Patient("BN02", "Tran Thi B", 25));
        pq.addPatient(new Patient("BN03", "Le Van C", 40));

        pq.displayQueue();

        System.out.println("Benh nhan tiep theo: " + pq.peekNextPatient());

        System.out.println("Bac si goi kham...");
        pq.callNextPatient();

        pq.displayQueue();
    }
}
