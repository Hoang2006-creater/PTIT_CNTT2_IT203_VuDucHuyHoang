package BTTH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = null ;
        int n = 0;
        int choice;

        do {
            System.out.println("\n Quan ly sinh vien");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo hoc luc");
            System.out.println("4. Sap xep theo diem giam dan");
            System.out.println("5. Thoat");
            System.out.print("Chon: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    n = Integer.parseInt(sc.nextLine());

                    students = new Student[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap sinh vien thu " + (i + 1));

                        String id;
                        while (true) {
                            System.out.print("Ma SV : ");
                            id = sc.nextLine();
                            if (id.startsWith("SV") && id.length() == 5) {
                                break;
                            }
                            System.out.println("Ma sinh vien khong hop le");
                        }

                        System.out.print("Ho ten: ");
                        String name = sc.nextLine();

                        System.out.print("Diem trung binh: ");
                        double score = Double.parseDouble(sc.nextLine());

                        students[i] = new Student(id, name, score);
                    }
                    break;

                case 2:
                    if (students == null || n == 0) {
                        System.out.println("Danh sach rong");
                        break;
                    }
                    for (Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    if (students == null) {
                        System.out.println("Chua them hoc sinh vao danh sach");
                        break;
                    }

                    System.out.print("Nhap hoc luc : ");
                    String rank = sc.nextLine();

                    boolean found = false;
                    for (Student s : students) {
                        if (s.getRank().equalsIgnoreCase(rank)) {
                            System.out.println(s);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Khong tim thay sinh vien nao");
                    }
                    break;

                case 4:
                    if (students == null) {
                        System.out.println("Chua them hoc sinh vao danh sach");
                        break;
                    }

                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (students[i].getScore() < students[j].getScore()) {
                                Student temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                            }
                        }
                    }
                    System.out.println("Da sap xep theo diem giam dan");
                    break;

                case 5:
                    System.out.println("Thoat chuong trinh thanh cong");
                    break;

                default:
                    System.out.println("Lua chon khong hop le");
            }

        } while (choice != 5);
    }
}
