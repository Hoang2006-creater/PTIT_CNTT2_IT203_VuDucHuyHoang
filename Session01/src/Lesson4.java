import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lesson4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách");
        double price =sc.nextDouble();

        System.out.print("Nhập tỷ giá");
        float rate =sc.nextFloat();

        double total = price * rate ;

        long totalChange=(long) total;

        System.out.println("Giá chính sác: " + total );
        System.out.println("Giá làm tròn để thanh toán: " +totalChange);
    }
}