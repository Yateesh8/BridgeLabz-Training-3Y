package javaStringLevel2;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        int userWins = 0, compWins = 0;

        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors) for game " + i + ": ");
            String user = sc.next().toLowerCase();

            int rand = (int)(Math.random() * 3);
            String comp = rand == 0 ? "rock" : rand == 1 ? "paper" : "scissors";

            String winner;
            if (user.equals(comp)) winner = "Draw";
            else if ((user.equals("rock") && comp.equals("scissors")) ||
                    (user.equals("paper") && comp.equals("rock")) ||
                    (user.equals("scissors") && comp.equals("paper"))) {
                winner = "User";
                userWins++;
            } else {
                winner = "Computer";
                compWins++;
            }

            System.out.println(i + "\t" + user + "\t" + comp + "\t" + winner);
        }

        double userPercent = (userWins * 100.0) / n;
        double compPercent = (compWins * 100.0) / n;

        System.out.println("Total Wins -> User: " + userWins + ", Computer: " + compWins);
        System.out.println("Winning Percentage -> User: " + userPercent + "%, Computer: " + compPercent + "%");
    }
}
