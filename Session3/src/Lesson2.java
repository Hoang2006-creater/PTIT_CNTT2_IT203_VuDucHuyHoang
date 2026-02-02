import java.util.Scanner;
public class Lesson2 {

   public static int searchBooks(String[] arr, String search){
       for (int i = 0;i<arr.length;i++){
           if (arr[i].equals(search)) {
               return i+1;
           }
       }
       return -1;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] books = {
                "Doraemon",
                "Dragon ball",
                "No Pain, No gain",
                "Naruto",
                "Ty quay"
        };

        System.out.print("Nhập tên sách cần tìm: ");
        String n =sc.nextLine();

        int index =searchBooks(books,n);
        if (index!=-1){
            System.out.println("Tìm thấy sách " +n + " tại vị trí số :"+index);
        }else
            System.out.println("Sách không tồn tại");

    }
}