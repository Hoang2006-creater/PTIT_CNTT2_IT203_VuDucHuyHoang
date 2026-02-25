package OnTap;

import java.util.Scanner;

public class Cau1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();
        String nguyenAm= "";
        String phuAm= "";

        for (int i = 0;i<input.length();i++){
            char c =input.charAt(i);

            if (Character.isLetter(c)) {
                c=Character.toLowerCase(c);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    nguyenAm+=c;
                }else {
                    phuAm+=c;
                }

            }
        }
        System.out.println("Nguyen am: " +nguyenAm);
        System.out.println("Phu am:  " +phuAm);
    }
}
