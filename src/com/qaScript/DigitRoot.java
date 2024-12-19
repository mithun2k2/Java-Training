package com.qaScript;

/*
 * Digital root is the recursive sum of all the digits in a number.

* Given n, take the sum of the digits of n. If that value has more than one digit,
* continue reducing in this way until a single-digit number is produced.
* The input will be a non-negative integer.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */

public class DigitRoot {
    public static int digitRoot(int n){
        while(n>=10){ // Outer loop ensures digit always started from two or more
            int sum =0;
            while(n>0){ // Inner loop iterates through the digit, in the process adding the last digit
                        // and remove the remaining digit
                sum += n%10; // Add the last digit
                n/=10; // remove the remaining
            }
            n = sum; // Update the
        }
        return n;
    }

    public static void main(String[]args){
        int inputNumber = 9875;
        int result = digitRoot(inputNumber);

        System.out.println(result);
    }
}

/****
 * Example Walkthrough:
 * Let’s say n=9875n=9875:
 *     First Iteration:
 *         sum = 0
 *         n=9875
 *             Last digit = 9875%10=5, sum = 0 + 5 = 5
 *             Remaining n=9875/10=987
 *             Last digit = 987%10=7, sum = 5 + 7 = 12
 *             Remaining n=987/10=98
 *             Last digit = 98%10=8, sum = 12 + 8 = 20
 *             Remaining n=98/10=9
 *             Last digit = 9%10=9, sum = 20 + 9 = 29
 *             Remaining n=9/10=0
 *         After inner loop: sum=29, update n=29.
 *
 *     Second Iteration:
 *         sum = 0
 *         n=29
 *             Last digit = 29%10=9, sum = 0 + 9 = 9
 *             Remaining n=29/10=2
 *             Last digit = 2%10=2, sum = 9 + 2 = 11
 *             Remaining n=2/10=0
 *         After inner loop: sum=11, update n=11.
 *     Third Iteration:
 *         sum = 0
 *         n=11n=11
 *             Last digit = 11%10=1, sum = 0 + 1 = 1
 *             Remaining n=11/10=1
 *             Last digit = 1%10=1, sum = 1 + 1 = 2
 *             Remaining n=1/10=0
 *         After inner loop: sum=2, update n=2.
 *
 *     Final Value:
 *         n=2(single digit), outer loop ends, and n is returned.
 *
 * Output:
 * The digital root of 9875 is 2.
 * The digital root of 9875 is 2.
 ****/
