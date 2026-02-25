import java.util.Scanner;

public class Cau1Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap vao chuoi: ");
        String s = sc.nextLine();

        s = s.toLowerCase();

        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c) || c == ' ') {
                temp += c;
            }
        }
        temp = temp.trim();

        String result = "";
        boolean vietHoa = true;

        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);

            if (c == ' ') {
                if (result.charAt(result.length() - 1) != ' ') {
                    result += c;
                }
                vietHoa = true;
            } else {
                if (vietHoa) {
                    result += Character.toUpperCase(c);
                    vietHoa = false;
                } else {
                    result += c;
                }
            }
        }

        System.out.println("Chuoi sau khi chuan hoa: " + result);
    }
}