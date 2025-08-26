package javaStringLevel3;

import java.util.Scanner;
import java.util.Arrays;

public class UniqueCharacters {
    public static int length(String s) {
        int len = 0;
        try { while(true) { s.charAt(len); len++; } } catch(Exception e) {}
        return len;
    }

    public static char[] findUnique(String s) {
        int len = length(s);
        char[] result = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) if (s.charAt(j) == c) found = true;
            if (!found) result[count++] = c;
        }
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Unique characters: " + Arrays.toString(findUnique(s)));
        sc.close();
    }
}
