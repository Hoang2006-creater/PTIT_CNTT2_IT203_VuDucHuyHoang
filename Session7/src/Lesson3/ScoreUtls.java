package Lesson3;

public class ScoreUtls {
    public static boolean checklPass(double score){
        return score >=5;
    }
    public static double calculateAverage(double[] scores) {
        double sum= 0;
        for(int i = 0;i<scores.length;i++){
            sum+=scores[i];
        }
        return sum/scores.length;
    }
}

