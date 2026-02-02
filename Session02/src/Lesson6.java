import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = -1;
        int sum = 0;
        int openDays = 0;

        for (int i = 2; i <= 8; i++) {
            String dayName;
            if (i == 8) dayName = "Chu Nhat";
            else dayName = "Thu " + i;

            System.out.print("Nhap so luot muon sach cua " + dayName + ": ");
            int borrow = sc.nextInt();

            if (borrow == 0) {
                continue;
            }

            if (max == -1 || borrow > max) {
                max = borrow;
            }

            if (min == -1 || borrow < min) {
                min = borrow;
            }

            sum += borrow;
            openDays++;
        }

        if (openDays == 0) {
            System.out.println("Khong co ngay nao mo cua.");
        } else {
            double avg = (double) sum / openDays;

            System.out.println("Luot muon cao nhat: " + max);
            System.out.println("Luot muon thap nhat: " + min);
            System.out.println("Luot muon trung binh: " + avg);
        }
    }
}
