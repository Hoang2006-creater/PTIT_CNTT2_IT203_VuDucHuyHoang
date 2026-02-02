public class Student {
    private String studentId;
    private String fullName;
    private int birthYear;
    private double gpa;

    public Student(String studentId, String fullName, int birthYear, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Điểm trung bình: " + gpa);
    }
}
    class StudentDemo{
        public static void main(String[] args){
            Student sv1=new Student("SV001","Vu Duc Huy Hoang",2006,8.2);
            Student sv2=new Student("SV002"," Huy Hoang",2006,8.2);
            sv1.displayInfo();
            sv2.displayInfo();
        }
    }

