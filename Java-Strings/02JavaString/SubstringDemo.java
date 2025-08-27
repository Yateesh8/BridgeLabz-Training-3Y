package javaStringLevel1;

import java.util.Scanner;

public class SubstringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String userSubstring = "";
        for (int i = start; i < end; i++) {
            userSubstring += text.charAt(i);
        }

        String builtInSubstring = text.substring(start, end);

        boolean same = true;
        if (userSubstring.length() != builtInSubstring.length()) same = false;
        else {
            for (int i = 0; i < userSubstring.length(); i++) {
                if (userSubstring.charAt(i) != builtInSubstring.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println(userSubstring);
        System.out.println(builtInSubstring);
        System.out.println(same);
    }
}
