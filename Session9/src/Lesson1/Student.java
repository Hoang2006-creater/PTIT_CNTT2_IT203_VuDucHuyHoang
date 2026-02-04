package Lesson1;

public class Student extends Person {
    private  String studentId;
    private double avg;

    public Student(String name ,int age,String studentId, double avg) {
        super(name,age);
        this.studentId = studentId;
        this.avg = avg;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + avg);
    }
}
    