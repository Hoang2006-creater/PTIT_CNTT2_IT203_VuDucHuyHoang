import java.util.Scanner;

public class BTTL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap so nguyen ");
        int number = sc.nextInt();
        if(number >1 && number %2 != 0 && number %3 != 0){
            System.out.println("Đây là số nguyên tố");
        }else
            System.out.println("Không phải số nguyên tố");

        int n = 0;
        int choice;

        do {
            System.out.println("""
                   +------------------Menu---------------------+
                   |1. Nhập vào 1 số nguyên dương n            |
                   |2. Tính tổng của số chẵn và tổng số lẻ < n |
                   |3. Tìm các số hoàn hảo < n                 |
                   |4. Tính n!                                 |
                   |5. Thoát chương trình                      |
                   +-------------------------------------------+
                    """);
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    do {
                        System.out.print("Nhap n : ");
                        n = sc.nextInt();
                    } while (n <= 0);
                    break;

                case 2:
                    if (n <= 0) {
                        System.out.println("Vui long nhap n truoc!");
                        break;
                    }

                    int sumEven = 0;
                    int sumOdd = 0;

                    for (int i = 1; i < n; i++) {
                        if (i % 2 == 0)
                            sumEven += i;
                        else
                            sumOdd += i;
                    }

                    System.out.println("Tong so chan < n = " + sumEven);
                    System.out.println("Tong so le < n = " + sumOdd);
                    break;

                case 3:
                    if (n <= 0) {
                        System.out.println("Vui long nhap n truoc!");
                        break;
                    }

                    System.out.println("Cac so hoan hao < n:");

                    for (int i = 1; i < n; i++) {
                        int sum = 0;

                        for (int j = 1; j <= i / 2; j++) {
                            if (i % j == 0)
                                sum += j;
                        }

                        if (sum == i && i != 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    if (n <= 0) {
                        System.out.println("Vui long nhap n truoc!");
                        break;
                    }

                    long factorial = 1;
                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                    }

                    System.out.println("n! = " + factorial);
                    break;

                case 5:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 5);

    }
}