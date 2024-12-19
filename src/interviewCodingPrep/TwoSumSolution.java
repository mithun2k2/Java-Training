package interviewCodingPrep;

import java.util.Arrays;

/**Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 Given nums = [7, 2, 11, 15], target = 9,
 Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 **/

public class TwoSumSolution {
    public static int[] twoSum(int[]nums, int target){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]== target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[]args){
        int[]input = new int[]{7, 2, 11, 15};
        int target =9;
        int[] actual = twoSum(input, target);
        System.out.println(Arrays.toString(actual));

        int[] input1 = new int[]{3,5,2,-4,8};
        int target1 = 7;
        int[] actual1 = twoSum(input1, target1);
        System.out.println(Arrays.toString(actual1));

        int[] input2 = new int[]{3,6,2,-4,8};
        int target2 = 14;
        int[] actual2 = twoSum(input2, target2);
        System.out.println(Arrays.toString(actual2));

    }
}

//    For each i, iterates through the remaining elements in the array.
//    Total iterations across all pairs:
//        Iterates n - 1 times for i = 0.
//        Iterates n - 2 times for i = 1.
//        ...
//        Iterates 1 time for i = n - 2.
//        Summation:
//        T=(n−1)+(n−2)+…+1=(n−1)n/2
//
//
//Comparison in Inner Loop:
//
//if (nums[i] + nums[j] == target) {
//
//    Executes once per pair.
//
//Overall Time Complexity:
//
//    Dominated by the nested loops.
//    Total operations:
//    T(n)=O(n2)
//    T(n)=O(n2)
//    Time Complexity: O(n²).
//
//Space Complexity:
//Space Used by Input:
//
//    The input array nums has n elements → O(n).
//
//Additional Variables:
//
//    Loop Variables:
//        i and j: Constant space → O(1).
//    Return Array:
//        An array of size 2 → O(1).
//
//Overall Space Complexity:
//
// No additional data structures used (besides the small array for the result).
//  Space Complexity: O(1) (excluding input).
// Time Complexity: O(n²) (due to nested loops).
//Space Complexity: O(1) (excluding input array).
