package javaMethodsLevel3;
import java.util.Arrays;

public class NumberCheckerPalindrome {

    // Count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Store digits in array
    public static int[] getDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) digits[i] = str.charAt(i) - '0';
        return digits;
    }

    // Reverse array
    public static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];
        for (int i = 0; i < n; i++) rev[i] = arr[n - 1 - i];
        return rev;
    }

    // Compare arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Check palindrome
    public static boolean isPalindrome(int[] digits) {
        return areArraysEqual(digits, reverseArray(digits));
    }

    // Duck number (non-zero digit present, does not start with 0)
    public static boolean isDuckNumber(int[] digits) {
        if (digits[0] == 0) return false;
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 12021;
        int[] digits = getDigits(num);

        System.out.println("Number = " + num);
        System.out.println("Count of digits = " + countDigits(num));
        System.out.println("Reversed digits = " + Arrays.toString(reverseArray(digits)));
        System.out.println("Is Palindrome? " + isPalindrome(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
    }
}
