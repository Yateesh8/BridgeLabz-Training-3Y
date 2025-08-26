package javaStringLevel3;

import java.util.Scanner;

public class FrequencyUnique {
    public static char[] uniqueChars(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(sb.indexOf(""+c)==-1) sb.append(c);
        }
        return sb.toString().toCharArray();
    }

    public static String[][] freq(String s) {
        char[] u = uniqueChars(s);
        String[][] res = new String[u.length][2];
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++) freq[s.charAt(i)]++;
        for(int i=0;i<u.length;i++){
            res[i][0]=""+u[i];
            res[i][1]=""+freq[u[i]];
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        String[][] r = freq(s);
        for(String[] x:r) System.out.println(x[0]+" : "+x[1]);
        sc.close();
    }
}
