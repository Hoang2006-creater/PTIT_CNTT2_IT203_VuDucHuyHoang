package OnTap;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();

        int maxCount=0;
        char result = ' ';
        for(int i =0;i<str.length();i++){
            char c =str.charAt(i);

            if(c==' '){
                continue;
            }
            int count =0;
            for(int j = 0;j<str.length();j++){
                if(c== str.charAt(j)){
                    count++;
                }
            }
            if(count >maxCount){
                maxCount=count;
                result=c;

            }
        }
    }
}

