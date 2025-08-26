package javaStringLevel2;

import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0, draws = 0;

        System.out.println("\nGame\tUser\tComputer\tWinner");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors) for game " + i + ": ");
            String user = sc.next().toLowerCase();

            int rand = (int) (Math.random() * 3);
            String comp = rand == 0 ? "rock" : rand == 1 ? "paper" : "scissors";

            String winner;
            if (user.equals(comp)) {
                winner = "Draw";
                draws++;
            } else if ((user.equals("rock") && comp.equals("scissors")) ||
                    (user.equals("paper") && comp.equals("rock")) ||
                    (user.equals("scissors") && comp.equals("paper"))) {
                winner = "User";
                userWins++;
            } else {
                winner = "Computer";
                compWins++;
            }

            System.out.println(i + "\t" + user + "\t" + comp + "\t\t" + winner);
        }

        double userPercent = (userWins * 100.0) / n;
        double compPercent = (compWins * 100.0) / n;
        double drawPercent = (draws * 100.0) / n;

        userPercent = Math.round(userPercent * 100.0) / 100.0;
        compPercent = Math.round(compPercent * 100.0) / 100.0;
        drawPercent = Math.round(drawPercent * 100.0) / 100.0;

        System.out.println("\nTotal Wins -> User: " + userWins + ", Computer: " + compWins + ", Draws: " + draws);
        System.out.println("Winning Percentage -> User: " + userPercent + "%, Computer: " + compPercent + "%, Draw: " + drawPercent + "%");
    }
}
