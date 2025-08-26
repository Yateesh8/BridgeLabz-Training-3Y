package javaMethodsLevel3;

public class NumberCheckerSpecial {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) { sum += num % 10; num /= 10; }
        return sum;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        return sumOfDigits(square) == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1, temp = num;
        while (temp != 0) { int d = temp % 10; sum += d; product *= d; temp /= 10; }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || String.valueOf(num).endsWith("7");
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println("Number = " + num);
        System.out.println("Is Prime? " + isPrime(num));
        System.out.println("Is Neon? " + isNeon(num));
        System.out.println("Is Spy? " + isSpy(num));
        System.out.println("Is Automorphic? " + isAutomorphic(num));
        System.out.println("Is Buzz? " + isBuzz(num));
    }
}
