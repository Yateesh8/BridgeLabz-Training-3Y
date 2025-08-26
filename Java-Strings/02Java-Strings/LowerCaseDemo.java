package javaStringLevel1;

import java.util.Scanner;

public class LowerCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String manual = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
            manual += c;
        }

        String builtIn = text.toLowerCase();

        boolean same = true;
        if (manual.length() != builtIn.length()) same = false;
        else {
            for (int i = 0; i < manual.length(); i++) {
                if (manual.charAt(i) != builtIn.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println(manual);
        System.out.println(builtIn);
        System.out.println(same);
    }
}
