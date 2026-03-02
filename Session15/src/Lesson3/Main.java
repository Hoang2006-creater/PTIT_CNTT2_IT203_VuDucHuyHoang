package Lesson3;

public class Main {
    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] process1 = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println("Process 1 hop le? " + checker.checkProcess(process1));

        checker.reset();

        String[] process2 = {"PUSH", "POP", "POP"};
        System.out.println("Process 2 hop le? " + checker.checkProcess(process2));

        checker.reset();

        String[] process3 = {"PUSH", "PUSH", "POP"};
        System.out.println("Process 3 hop le? " + checker.checkProcess(process3));
    }
}
