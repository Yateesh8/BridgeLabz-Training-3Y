package javaStringLevel2;
import java.util.Scanner;

public class SplitWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }
        String[] manual = new String[wordCount + 1];
        int index = 0, start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                manual[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        manual[index] = text.substring(start);


        String[] builtin = text.split(" ");

        System.out.println("Manual Split:");
        for (String w : manual) System.out.println(w);

        System.out.println("\nBuilt-in Split:");
        for (String w : builtin) System.out.println(w);

        sc.close();
    }
}
