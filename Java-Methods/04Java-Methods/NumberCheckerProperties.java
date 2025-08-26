package javaMethodsLevel3;

public class NumberCheckerProperties {

    // Get sum of proper divisors
    public static int sumOfDivisors(int num) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    // Perfect number check
    public static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num;
    }

    // Abundant number check
    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    // Deficient number check
    public static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    // Factorial helper
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    // Strong number check
    public static boolean isStrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 28; // Test with 28 (Perfect), 12 (Abundant), 15 (Deficient), 145 (Strong)

        System.out.println("Number = " + num);
        System.out.println("Is Perfect? " + isPerfect(num));
        System.out.println("Is Abundant? " + isAbundant(num));
        System.out.println("Is Deficient? " + isDeficient(num));
        System.out.println("Is Strong? " + isStrong(num));
    }
}
