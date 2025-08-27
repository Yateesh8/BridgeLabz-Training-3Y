package javaMethodsLevel3;

import java.util.HashSet;

public class OTPGenerator {

    // Generate a 6-digit OTP
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; // ensures 100000 to 999999
    }

    // Check if array of OTPs is unique
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false; // duplicate found
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) System.out.println(otp);

        // Check uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique ");
        } else {
            System.out.println("Some OTPs are duplicates ");
        }
    }
}
