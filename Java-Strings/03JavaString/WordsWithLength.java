package javaStringLevel2;
import java.util.*;

public class WordsWithLength {
    public static String[] customSplit(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') count++;
        }
        String[] words = new String[count];
        int idx = 0, start = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                words[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[][] withLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(getLength(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = withLength(customSplit(text));
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + Integer.parseInt(result[i][1]));
        }
    }
}
