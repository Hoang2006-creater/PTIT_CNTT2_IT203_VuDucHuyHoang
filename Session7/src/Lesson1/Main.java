package Lesson1;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("SV001","Hoang");
        Student s2 = new Student("SV002","Hoang");
        Student s3 = new Student("SV003","Hoang");
        s1.displayInfo();

        s2.displayInfo();

        s3.displayInfo();

        Student.printTotalStudent();
    }
}
