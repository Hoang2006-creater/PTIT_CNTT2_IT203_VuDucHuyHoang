package Lesson4;

public class Main {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("Hoang");
        ClassRoom s2 = new ClassRoom("Huy");
        ClassRoom s3 = new ClassRoom("Vu");

        s1.contribute(100_000);
        s2.contribute(150_000);
        s3.contribute(200_000);

        ClassRoom.showClassFund();
    }
}

