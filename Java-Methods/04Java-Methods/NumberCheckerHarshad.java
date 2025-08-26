package javaMethodsLevel3;

public class NumberCheckerHarshad {

    // Count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Store digits in array
    public static int[] getDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';
        return digits;
    }

    // Sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Check Harshad number
    public static boolean isHarshad(int num, int[] digits) {
        return num % sumOfDigits(digits) == 0;
    }

    // Digit frequency
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // [digit, count]
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int num = 21;
        int[] digits = getDigits(num);

        System.out.println("Number = " + num);
        System.out.println("Count of digits = " + countDigits(num));
        System.out.println("Sum of digits = " + sumOfDigits(digits));
        System.out.println("Sum of squares = " + sumOfSquares(digits));
        System.out.println("Is Harshad? " + isHarshad(num, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
        }
    }
}
