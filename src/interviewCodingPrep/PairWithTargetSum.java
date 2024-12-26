package interviewCodingPrep;

import java.util.HashMap;

/*
Given an array arr[] of positive integers and another integer target.
Determine if there exists two distinct indices such that the sum of
their elements is equals to target.

Examples:

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16.
Input: arr[] = [1, 2, 4, 3, 6], target = 11
Output: false
Explanation: None of the pair makes a sum of 11.
Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[].
Constraints:
        1 ≤ arr.size ≤ 105
        1 ≤ arr[i] ≤ 105
        1 ≤ target ≤ 2*105

*/
public class PairWithTargetSum {
    public static boolean hasPairWithTargetSum(int[]arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through the array
        for(int i=0; i<arr.length; i++){
            // Calculate the complement to reach the target
            int complement = target - arr[i];
            // check if the complement present in the array
            if(map.containsKey(complement)){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }

    public static void main(String[]args){
        int[]arr =  {1, 4, 45, 6, 10, 8};
        int target = 16;
        int[]arr1 = {1, 2, 4, 3, 6};
        int target1 = 11;

        boolean result = hasPairWithTargetSum(arr, target);
        boolean result1 =hasPairWithTargetSum(arr1, target1);
        System.out.println("Pair with target sum exists: " + result);
        System.out.println("Pair with target sum exists: " + result1);
    }
}
