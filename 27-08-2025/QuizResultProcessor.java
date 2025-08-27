package ClassPrograms;

import java.util.*;

public class QuizResultProcessor {
    public static int calculateScore(String[] correctAnswers, String[] userAnswers) {
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    public static String getGrade(int score, int total) {
        double percent = (score * 100.0) / total;
        if (percent >= 90) return "A";
        else if (percent >= 75) return "B";
        else if (percent >= 50) return "C";
        else return "D";
    }

    public static void main(String[] args) {

        String[] correctAnswers = {"A", "B", "C", "D", "A"};

        String[][] userAnswers = {
                {"A", "B", "C", "D", "A"},
                {"A", "C", "C", "D", "B"},
                {"B", "B", "A", "D", "C"}
        };

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < userAnswers.length; i++) {
            int score = calculateScore(correctAnswers, userAnswers[i]);
            scores.add(score);
            String grade = getGrade(score, correctAnswers.length);
            System.out.println("User " + (i + 1) + ": Score = " + score
                    + "/" + correctAnswers.length + ", Grade = " + grade);
        }

        System.out.println("All user scores: " + scores);
    }
}
