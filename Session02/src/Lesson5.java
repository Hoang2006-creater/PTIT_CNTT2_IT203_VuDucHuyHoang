import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int totalPoints=100;
        int outDate = 0;
        while (true){
        System.out.println("Nhap so ngay tra muon");
         outDate=sc.nextInt();
         if(outDate==999){
             break;
         }
        int date = outDate * 2;
         totalPoints -=date;
        System.out.println("Trả trễ " +outDate +"ngày:"+ -date +"diem"  );
        }
        System.out.println("Tổng điểm uy tín là:" +totalPoints);
        if(totalPoints>120){
            System.out.println("Xếp loại: Độc giả thân thiết");
        } else if (totalPoints>=80) {
            System.out.println("Xếp loại: Độc giả tiêu chuẩn");
        }else
            System.out.println("Xếp loại: Độc giả Độc giả cần lưu ý");
    }
}