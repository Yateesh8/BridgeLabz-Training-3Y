package javaStringLevel3;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static char findFirstNonRepeating(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++) if (freq[s.charAt(i)] == 1) return s.charAt(i);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        char c = findFirstNonRepeating(s);
        System.out.println("First non-repeating character: " + (c==0 ? "None" : c));
        sc.close();
    }
}
