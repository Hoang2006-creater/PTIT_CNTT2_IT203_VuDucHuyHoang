package Lesson3;

import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack = new Stack<>();

    // Kiểm tra quy trình
    public boolean checkProcess(String[] actions) {

        for (String action : actions) {

            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("MEDICATION");
            }

            else if (action.equalsIgnoreCase("POP")) {

                if (stack.isEmpty()) {
                    System.out.println("Loi: POP khi stack dang rong!");
                    return false;
                }

                stack.pop();
            }

            else {
                System.out.println("Thao tac khong hop le: " + action);
                return false;
            }
        }

        // Sau khi kết thúc
        if (!stack.isEmpty()) {
            System.out.println("Loi: Ket thuc nhung van con thuoc chua hoan tat!");
            return false;
        }

        return true;
    }

    // Reset Stack
    public void reset() {
        stack.clear();
    }
}