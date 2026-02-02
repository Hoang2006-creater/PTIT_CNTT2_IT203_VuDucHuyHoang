package Lesson6;

public class User {

    public final int id;
    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public void displayInfo() {
        System.out.println("User{id=" + id + ", username='" + username + "'}");
    }
}
