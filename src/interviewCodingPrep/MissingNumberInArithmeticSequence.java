package interviewCodingPrep;

public class MissingNumberInArithmeticSequence {

    public static int findMissingNumber(int[]arr){
        // Calculate the total number of elements in the array including the missing one
        int n = arr.length+1;

        // Calculate the common difference
        int d = (arr[arr.length-1] - arr[0])/arr.length;

        //Iterate through all the elements of the array to find the discrepancy
        for(int i=1; i < arr.length; i++){
            if(arr[i] - arr[i-1] != d){
                return arr[i-1] + d;
            }
        }
        return -1; // Return -1 if no missing number is found(Shouldn't happen with valid input)
    }

    public static void main(String[]args){
        int[]arr = {1,3,7,9,11,13,15};
        System.out.println("Missing number: " + findMissingNumber(arr));
    }
}
