package com.qaScript;

public class LinearSearch {
    public void linearSearch(){
        int[] numbers = {2,3,5,80,90,100};
        int valueToFind = 80;
        boolean found = false;

        for(int num:numbers){
            if(num==valueToFind){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(valueToFind+ " was found in the array");
        }else{
            System.out.println(valueToFind + " wasn't found in the array");
        }
    }
    public static void main(String[] args){
        LinearSearch search = new LinearSearch();
        search.linearSearch();

    }
}
