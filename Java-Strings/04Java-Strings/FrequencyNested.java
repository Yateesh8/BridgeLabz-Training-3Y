package javaStringLevel3;

import java.util.Scanner;

public class FrequencyNested {
    public static String[][] frequency(String s){
        char[] ch = s.toCharArray();
        int[] freq = new int[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0') continue;
            freq[i]=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]='0';
                }
            }
        }
        int count=0;
        for(char c:ch) if(c!='0') count++;
        String[][] res = new String[count][2];
        int k=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0'){
                res[k][0]=""+ch[i];
                res[k++][1]=""+freq[i];
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        String[][] r = frequency(s);
        for(String[] x:r) System.out.println(x[0]+" : "+x[1]);
        sc.close();
    }
}
