package BaiTapThucHanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IManager<Category> categoryManager = new CategoryManager();
        IManager<Book> bookManager = new BookManager();

        int choice;

        do {
            System.out.println("\n===== MENU CHÍNH =====");
            System.out.println("1. Quản lý Danh mục");
            System.out.println("2. Quản lý Sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    int catChoice;
                    do {
                        System.out.println("\n--- QUẢN LÝ DANH MỤC ---");
                        System.out.println("1. Thêm");
                        System.out.println("2. Sửa");
                        System.out.println("3. Xóa");
                        System.out.println("4. Hiển thị");
                        System.out.println("0. Quay lại");
                        System.out.print("Chọn: ");
                        catChoice = sc.nextInt();
                        sc.nextLine();

                        switch (catChoice) {
                            case 1:
                                System.out.print("ID: ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Name: ");
                                String name = sc.nextLine();
                                System.out.print("Description: ");
                                String desc = sc.nextLine();
                                categoryManager.add(new Category(id, name, desc));
                                break;
                            case 2:
                                System.out.print("Nhập ID cần sửa: ");
                                int uid = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Name mới: ");
                                String uname = sc.nextLine();
                                System.out.print("Description mới: ");
                                String udesc = sc.nextLine();
                                categoryManager.update(new Category(uid, uname, udesc));
                                break;
                            case 3:
                                System.out.print("Nhập ID cần xóa: ");
                                int did = sc.nextInt();
                                categoryManager.delete(did);
                                break;
                            case 4:
                                categoryManager.displayAll();
                                break;
                        }
                    } while (catChoice != 0);
                    break;

                case 2:
                    int bookChoice;
                    do {
                        System.out.println("\n--- QUẢN LÝ SÁCH ---");
                        System.out.println("1. Thêm");
                        System.out.println("2. Sửa");
                        System.out.println("3. Xóa");
                        System.out.println("4. Hiển thị");
                        System.out.println("0. Quay lại");
                        System.out.print("Chọn: ");
                        bookChoice = sc.nextInt();
                        sc.nextLine();

                        switch (bookChoice) {
                            case 1:
                                System.out.println("Danh mục hiện có:");
                                categoryManager.displayAll();

                                System.out.print("ID sách: ");
                                int bid = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Title: ");
                                String title = sc.nextLine();
                                System.out.print("Author: ");
                                String author = sc.nextLine();
                                System.out.print("Category ID: ");
                                int cid = sc.nextInt();
                                bookManager.add(new Book(bid, title, author, cid));
                                break;

                            case 2:
                                System.out.print("Nhập ID cần sửa: ");
                                int ubid = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Title mới: ");
                                String utitle = sc.nextLine();
                                System.out.print("Author mới: ");
                                String uauthor = sc.nextLine();
                                System.out.print("Category ID mới: ");
                                int ucid = sc.nextInt();
                                bookManager.update(new Book(ubid, utitle, uauthor, ucid));
                                break;

                            case 3:
                                System.out.print("Nhập ID cần xóa: ");
                                int dbid = sc.nextInt();
                                bookManager.delete(dbid);
                                break;

                            case 4:
                                bookManager.displayAll();
                                break;
                        }
                    } while (bookChoice != 0);
                    break;
            }

        } while (choice != 0);

        System.out.println("Thoát chương trình!");
    }
}