package interviewCodingPrep;

/**
 * Given a non-negative integer n. The task is to check if it is a power of 2.
 * Examples
 * Input: n = 8
 * Output: true
 * Explanation: 8 is equal to 2 raised to 3 (23 = 8).
 * Input: n = 98
 * Output: false
 * Explanation: 98 cannot be obtained by any power of 2.
 * ***/

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPowerOfTwo(8)); // true
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(7)); // false
        System.out.println(isPowerOfTwo(1)); // true
        System.out.println(isPowerOfTwo(0)); // false
    }

}

/***
 * Example 1: n = 8 (which is 2^3)
 *
 *     Binary Representation of 8:
 *         8 in binary is 1000.
 *
 *     Subtract 1 from n:
 *         Subtracting 1 from 8 gives 7.
 *         7 in binary is 0111.
 *
 *     Bitwise AND operation (n & (n - 1)):
 *         Perform the bitwise AND operation between 8 (binary 1000) and 7 (binary 0111):
 *
 * 1000    (binary for 8)
 * & 0111  (binary for 7)
 * --------
 * 0000    (result of AND)
 *
 * The result is 0000 (binary 0).
 *
 * So, 8 & (8 - 1) equals 0, confirming that 8 is a power of 2.
 *
 *
 *
 *
 * ***/
