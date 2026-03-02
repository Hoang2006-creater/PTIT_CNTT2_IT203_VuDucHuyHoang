import java.util.Stack;

public class Example {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Phan tu tren cung la "+stack.pop());
        System.out.println(stack);
        // Duyệt stack :top-down
        while (!stack.isEmpty()){
            Integer top = stack.pop();
            System.out.println("Top: "+top);
        }
    }
}
