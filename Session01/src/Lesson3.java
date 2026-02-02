import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lesson3 {
    public static void main(String[] args) {
        String book1="Java Basic";
        String book2="Python Intro";
        String temp = book1;
        book1=book2;
        book2=temp;
        System.out.println("Sách 1 :" +book1);
        System.out.println("Sách 2 :" +book2);
    }
}