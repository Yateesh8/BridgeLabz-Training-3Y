package javaStringLevel3;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r) if(s.charAt(l++)!=s.charAt(r--)) return false;
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println("Palindrome: "+isPalindrome(s));
        sc.close();
    }
}
