package javaStringLevel2;

import java.util.Scanner;

public class ShortLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split(" ");
        String shortest = words[0], longest = words[0];

        for (String w : words) {
            if (w.length() < shortest.length()) shortest = w;
            if (w.length() > longest.length()) longest = w;
        }

        System.out.println("Shortest = " + shortest);
        System.out.println("Longest = " + longest);
    }
}
