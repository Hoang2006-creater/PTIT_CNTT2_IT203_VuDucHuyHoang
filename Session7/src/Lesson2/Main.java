package Lesson2;

public class Main {
    public static void main(String[] args){
        int a = 10;
        int b =a;
        b=20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Student s1= new Student();
        s1.name = "Hoang";
        Student s2=s1;
        s2.name="Huy";
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
