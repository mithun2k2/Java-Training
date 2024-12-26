package interviewCodingPrep;

/*You are given an array arr of size n - 1 that contains distinct integers in
the range from 1 to n (inclusive).
This array represents a permutation of the integers from 1 to n with one element missing.
Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.
Constraints:
        1 ≤ arr.size() ≤ 10^6
        1 ≤ arr[i] ≤ arr.size() + 1
*/

public class MissingNumberFinder {
 public static int findMissingNumber(int[]arr){
     int n = arr.length+1; // Since the one number is missing
     long totalSum = (long) n *(n+1)/2; //if n is very large (e.g., 105105 or 106106),
                            // the total sum can exceed the range of an int.
                            // Using long ensures that the computation doesn’t overflow.

     long arrSum = 0;
     for(int num: arr){
         arrSum+=num;
     }
     return (int) (totalSum- arrSum);
    }

    public static void main(String[]args){
     int[]arr = {1, 2, 3, 5};
     int[]arr1 = {8,7,9,5,4,3,2,1};
     int[]arr2 = {2,4,6,5,7,9,8,3};
     long findMissingNumber =findMissingNumber(arr);
     System.out.println("The missing number of the array is: " + findMissingNumber(arr));
     System.out.println("The missing number of the array is: " + findMissingNumber(arr1));
     System.out.println("The missing number of the array is: " + findMissingNumber(arr2));
    }
}
