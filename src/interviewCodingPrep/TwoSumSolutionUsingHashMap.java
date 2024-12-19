package interviewCodingPrep;

import java.util.HashMap;

public class TwoSumSolutionUsingHashMap {
    public static int[] twoSum(int[]nums, int target) {
        // Create a Hash Map to store the difference and its index

        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            //Calculate the complement
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If found return the indices
                return new int[]{map.get(complement), i};
            }
            // Store the current number and it's index in the map
            map.put(nums[i], i);
        }
        return new int[]{};
    }
        public static void main(String[]args){
        //Example usage
            int[]nums ={2, 7, 11, 15};
            int target = 9;
            int[] result = twoSum(nums,target);
            if(result.length==2){
                System.out.println("Indicies: " + result[0] +"," + result[1]);
            }else{
                System.out.println("No solution found.");
            }
        }
}
