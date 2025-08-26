package javaMethodsLevel3;

import java.util.Scanner;

public class NumberChecker {

    // 1. Method to find count of digits in the number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // 2. Method to store the digits of the number in an array
    public static int[] getDigits(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // 3. Method to check if a number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        if (digits[0] == 0) return false;
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // 4. Method to check if number is an Armstrong number
    public static boolean isArmstrong(int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }

        int original = 0;
        for (int d : digits) {
            original = original * 10 + d;
        }

        return sum == original;
    }

    // 5. Method to find largest and second largest digit
    public static void largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second Largest digit = " + secondLargest);
    }

    // 6. Method to find smallest and second smallest digit
    public static void smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        System.out.println("Smallest digit = " + smallest);
        System.out.println("Second Smallest digit = " + secondSmallest);
    }

    // MAIN METHOD to test everything
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int[] digits = getDigits(num);

        System.out.println("Number = " + num);
        System.out.println("Count of digits = " + countDigits(num));
        System.out.println("Duck Number? " + isDuckNumber(digits));
        System.out.println("Armstrong Number? " + isArmstrong(digits));

        largestAndSecondLargest(digits);
        smallestAndSecondSmallest(digits);
    }
}
