package com.rikkeiedu.management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n MENU ");
            System.out.println("1. Them hoc sinh");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tinh diem trung binh");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();

                    System.out.print("Nhap diem: ");
                    double score = Double.parseDouble(sc.nextLine());

                    System.out.print("Nhap lop: ");
                    String className = sc.nextLine();

                    Student s = new Student(name, score, className);
                    StudentManager.addStudent(s);
                    break;

                case 2:
                    StudentManager.showAll();
                    break;

                case 3:
                    double avg = StudentManager.calculateAverageScore();
                    System.out.println("Diem trung binh: " + avg);
                    break;

                case 0:
                    return;
            }
        }
    }
}
