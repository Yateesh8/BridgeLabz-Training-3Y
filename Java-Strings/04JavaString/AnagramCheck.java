package javaStringLevel3;

import java.util.Scanner;

public class AnagramCheck {
    public static boolean areAnagrams(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int[] freq = new int[256];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for(int f:freq) if(f!=0) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter second string:");
        String s2 = sc.nextLine();
        System.out.println("Anagram: "+areAnagrams(s1,s2));
        sc.close();
    }
}
