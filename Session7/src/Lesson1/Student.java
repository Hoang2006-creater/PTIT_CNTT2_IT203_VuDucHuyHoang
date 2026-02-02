package Lesson1;

public class Student {
    private String studentId;
    private String studentName;

    public static int totalStudent= 0;

    public Student(String studentId,String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
        totalStudent++;
    }

    public void displayInfo(){
        System.out.println("MA SV: "+studentId);
        System.out.println("Ten SV: "+studentName);
    }
    public static void printTotalStudent(){
        System.out.println("Tong so sinh vien da tao:"+totalStudent);
    }
}

