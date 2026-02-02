public class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Đổi mật khẩu thành công!");
    }

    public void displayInfo() {
        System.out.println("Tên đăng nhập: " + username);
        System.out.println("Email: " + email);
        System.out.println("Mật khẩu: ");
    }
}

class AccountDemo {
    public static void main(String[] args) {

        Account acc = new Account("hoang123", "123456", "hoang@gmail.com");

        acc.displayInfo();

        acc.changePassword("newpass789");

        acc.displayInfo();
    }
}
