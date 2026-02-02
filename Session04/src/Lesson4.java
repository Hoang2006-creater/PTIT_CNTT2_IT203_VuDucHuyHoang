import java.util.Scanner;
public class Lesson4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma the: ");
        String code = sc.nextLine();
        String fullRegex = "^[A-Z]{2}\\d{9}$";
        if(code.matches(fullRegex)){
            System.out.println("Ma the hop le");
        }else{
            if (!code.matches("^[A-Z]{2}.*")) {
                System.out.println("Lỗi: Thiếu hoặc sai tiền tố 2 chữ cái in hoa (VD: TV)");
            }

            else if (!code.matches("^[A-Z]{2}\\d{4}.*")) {
                System.out.println("Lỗi: Năm không hợp lệ (phải gồm 4 chữ số)");
            }

            else if (!code.matches("^[A-Z]{2}\\d{4}\\d{5}$")) {
                System.out.println("Lỗi: Phải có 5 chữ số ngẫu nhiên ở cuối");
            }
            else {
                System.out.println("Mã thẻ không hợp lệ");
            }
        }
    }
}
