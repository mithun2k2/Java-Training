package com.qaScript;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[]args){
        int[] arr = {5,4,7,12,10};
        int[] arr2 = {5,7,3,9,12};
        Arrays.sort(arr);
        System.out.println("Length of the array is: " + arr.length);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        if(arr.equals(arr2)){
            System.out.println(" Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}
