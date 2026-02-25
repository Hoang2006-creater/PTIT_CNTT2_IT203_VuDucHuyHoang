import java.util.Scanner;

public class Cau1Phan2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap vao chuoi: ");
        String str = sc.nextLine();

        str = str.toLowerCase();
        boolean timThay = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int dem = 0;

            for (int j = 0; j < str.length(); j++) {
                if (c == str.charAt(j)) {
                    dem++;
                }
            }
            if (dem == 1) {
                System.out.println("Ky tu dau tien khong lap lai la: " + c);
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay ky tu khong lap lai!");
        }
    }
}