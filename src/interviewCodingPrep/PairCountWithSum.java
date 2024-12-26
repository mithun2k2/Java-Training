package interviewCodingPrep;

import java.util.HashMap;

/***
 * Given an array arr[] and an integer target. You have to find numbers of pairs in array arr[] which sums up to given target.
 *
 * Examples:
 *
 * Input: arr[] = [1, 5, 7, -1, 5], target = 6
 * Output: 3
 * Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5).
 * Input: arr[] = [1, 1, 1, 1], target = 2
 * Output: 6
 * Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).
 * Input: arr[] = [10, 12, 10, 15, -1], target = 125
 * Output: 0
 * Constraints:
 * 1 <= arr.size() <= 105
 * -104 <= arr[i] <= 104
 * 1 <= target <= 104
 *
 * ***/
public class PairCountWithSum {
    public static int pairCount(int[]arr, int target){
        HashMap<Integer, Integer> numCount = new HashMap<>();

        // Initialize the pairCount
        int pairCount =0;
        // Iterate through each number in array
        for(int num: arr){
            // Calculate the complement to find and store in the hash map
            int complement = target -num;
            if(numCount.containsKey(complement)){
                // Increment the pairCount
                pairCount+=numCount.get(complement);
            }
            //Update the number in the hash map
            numCount.put(num, numCount.getOrDefault(num, 0)+1);
        }
        return pairCount;
    }

    public static void main(String[]args){
        int[]arr = {1, 5, 7, -1, 5};
        int target = 6;

        int output = pairCount(arr, target);
        System.out.println(output);
    }
}

/***
 * Explanation:
 * Suppose an array arr = [1, 5, 7, -1, 5] and are processing it to keep track of the counts.
 *
 * When processing 1:
 *
 * numCount is currently empty: numCount = {}
 * Use numCount.getOrDefault(1, 0) ➔ returns 0 (since 1 is not in the map).
 * Update the count: numCount.put(1, 0 + 1) ➔ numCount = {1: 1}.
 * When processing 5 the first time:
 *
 * numCount = {1: 1}
 * Use numCount.getOrDefault(5, 0) ➔ returns 0.
 * Update the count: numCount.put(5, 0 + 1) ➔ numCount = {1: 1, 5: 1}.
 * When processing 7:
 *
 * numCount = {1: 1, 5: 1}
 * Use numCount.getOrDefault(7, 0) ➔ returns 0.
 * Update the count: numCount.put(7, 0 + 1) ➔ numCount = {1: 1, 5: 1, 7: 1}.
 * When processing -1:
 *
 * numCount = {1: 1, 5: 1, 7: 1}
 * Use numCount.getOrDefault(-1, 0) ➔ returns 0.
 * Update the count: numCount.put(-1, 0 + 1) ➔ numCount = {1: 1, 5: 1, 7: 1, -1: 1}.
 * When processing 5 the second time:
 *
 * numCount = {1: 1, 5: 1, 7: 1, -1: 1}
 * Use numCount.getOrDefault(5, 0) ➔ returns 1 (because 5 is already present).
 * Update the count: numCount.put(5, 1 + 1) ➔ numCount = {1: 1, 5: 2, 7: 1, -1: 1}.
 * Summary:
 * The line numCount.put(num, numCount.getOrDefault(num, 0) + 1); effectively ensures that:
 *
 * Every time num is encountered in the array, its count is incremented in the hashmap.
 * If num is not already in the hashmap, it initializes its count to 1. This mechanism enables efficient frequency counting, which is crucial for finding pairs that sum to a target later in the algorithm.
 * ***/