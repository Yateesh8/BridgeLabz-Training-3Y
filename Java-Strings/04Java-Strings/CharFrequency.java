package javaStringLevel3;

import java.util.Scanner;
import java.util.Arrays;

public class CharFrequency {
    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;
        char[] unique = s.chars().distinct().mapToObj(c -> (char)c).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString().toCharArray();
        String[][] res = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freq[unique[i]]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String[][] res = frequency(s);
        System.out.println("Character frequencies:");
        for(String[] r: res) System.out.println(r[0]+" : "+r[1]);
        sc.close();
    }
}
