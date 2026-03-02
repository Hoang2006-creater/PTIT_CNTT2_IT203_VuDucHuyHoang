package Lesson4;

public class Main {
    public static void main(String[] args) {

        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient(eq.createPatient("BN01", "Nguyen A", 2));
        eq.addPatient(eq.createPatient("BN02", "Tran B", 1));
        eq.addPatient(eq.createPatient("BN03", "Le C", 2));
        eq.addPatient(eq.createPatient("BN04", "Pham D", 1));

        eq.displayQueue();

        System.out.println("\nGoi kham...");
        eq.callNextPatient();
        eq.callNextPatient();

        eq.displayQueue();
    }
}