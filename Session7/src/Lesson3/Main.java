package Lesson3;

public class Main {
    public static void main(String[] args){
        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sach diem: 6.5, 8.0, 4.5");

        double avg = ScoreUtls.calculateAverage(scores);
        System.out.printf("Diem trung binh la: %.2f\n",avg);

        for(double score:scores){
            boolean pass = ScoreUtls.checklPass(score);
            System.out.println("- Diem " + score + ": " + (pass ? "Dat" : "Truot"));
        }
    }
}
