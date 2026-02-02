package Lesson6;

public class Main {
    public static void main(String[] args) {

        User u1 = new User(1, "admin", "123456");
        User u2 = new User(2, "user1", "abc");
        User u3 = new User(3, "user2", "password");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println("Danh sach user:");
        UserManager.showAllUsers();

        System.out.println("\nKiem tra dang nhap:");

        System.out.println("admin / 123456: "
                + UserManager.checkLogin("admin", "123456"));

        System.out.println("user1 / saiMatKhau: "
                + UserManager.checkLogin("user1", "saiMatKhau"));

    }
}
