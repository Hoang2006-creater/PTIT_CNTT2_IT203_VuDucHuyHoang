import java.util.regex.*;

public class Lesson5 {
    public static void main(String[] args) {

        String log = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";

        String regex = "(\\d{4}-\\d{2}-\\d{2}).*User: (\\w+).*Action: (\\w+).*BookID: (\\w+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(log);

        if (matcher.find()) {
            String date = matcher.group(1);
            String user = matcher.group(2);
            String action = matcher.group(3);
            String bookId = matcher.group(4);

            System.out.println("Ngày: " + date);
            System.out.println("Người dùng: " + user);
            System.out.println("Hành động: " + action);
            System.out.println("Mã sách: " + bookId);
        } else {
            System.out.println("Dòng log không hợp lệ");
        }
    }
}
