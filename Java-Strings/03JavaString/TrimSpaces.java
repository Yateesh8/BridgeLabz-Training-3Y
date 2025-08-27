package javaStringLevel2;

import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        String trimmed = "";
        for (int i = start; i <= end; i++) trimmed += text.charAt(i);
        System.out.println("Trimmed (manual): '" + trimmed + "'");
        System.out.println("Trimmed (built-in): '" + text.trim() + "'");
    }
}
