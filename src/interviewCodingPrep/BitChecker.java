package interviewCodingPrep;
/***
 *
 *
 * Given a number n and a bit number k, check if the kth index bit of n is set or not.
 * A bit is called set if it is 1.
 * The position of set bit '1' should be indexed starting
 * with 0 from the LSB side in the binary representation of the number.
 * Note: Index is starting from 0. You just need to return true or false.
 *
 * Examples :
 *
 * Input: n = 4, k = 0
 * Output: false
 * Explanation: Binary representation of 4 is 100, in which 0th index bit from LSB is not set. So, return false.
 * Input: n = 4, k = 2
 * Output: true
 * Explanation: Binary representation of 4 is 100, in which 2nd index bit from LSB is set. So, return true.
 * Input: n = 500, k = 3
 * Output: false
 * Explanation: Binary representation of 500 is 111110100, in which 3rd index bit from LSB is not set. So, return false.
 * Constraints:
 * 1 ≤ n ≤ 109
 * 0 ≤ k ≤ 31
 *
 ***/

public class BitChecker {
    public static boolean isKthBitSet(int n, int k) {
        return (n & (1 << k)) != 0;
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 0;
        boolean output = isKthBitSet(n, k);
        System.out.println(output);  // Output: false
    }
}


/***
 * The expression (n & (1 << k)) != 0 is a common way to check if a specific bit (the k-th bit) is set (i.e., if it is 1) in the binary representation of an integer n. Here’s a breakdown of the components of this expression:
 *
 * Left Shift Operator (<<):
 *
 * The expression 1 << k shifts the number 1 to the left by k positions in its binary form.
 * For example:
 * If k = 0, then 1 << 0 is 0001 in binary (which is 1).
 * If k = 1, then 1 << 1 is 0010 in binary (which is 2).
 * If k = 2, then 1 << 2 is 0100 in binary (which is 4).
 * Essentially, 1 << k generates a binary number where only the k-th bit is set to 1, and all other bits are 0.
 * Bitwise AND Operator (&):
 *
 * The & operator performs a bitwise AND operation between two numbers. It compares each bit of the two numbers:
 * If both bits are 1, the result is 1.
 * Otherwise, the result is 0.
 * In this context, we are comparing n and 1 << k.
 * For instance, if n = 4 (which is 100 in binary) and k = 0, then:  n (which is 4) in binary: 0100 1 << k (with k = 0) is 0001 (which is 1). - The bitwise AND operation n & (1 << k) results in: ``` 0100 0001
 * 0000 (which is 0 in decimal)
 *
 * Checking for Non-Zero:
 *
 * The result of the AND operation will be non-zero if the k-th bit in n is set (i.e., 1).
 * Thus, the expression (n & (1 << k)) != 0 checks if the result of the AND operation is different from 0.
 * If it is true (non-zero), that means the k-th bit is set; otherwise, it is not set.
 * Example
 * Let’s review an example to solidify this understanding:
 *
 * Example 1: n = 4 (which is 100 in binary) k = 0  1 << k results in 0001 (which is 1). Calculation: ``` 0100 (n) 0001 (1 << k)
 * 0000 (result)
 *
 * - Since the result is `0`, we conclude that the `0`-th bit is **not set**, and the output will be `false
 *
 * ***/