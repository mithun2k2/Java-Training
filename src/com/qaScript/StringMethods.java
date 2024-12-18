package com.qaScript;

public class StringMethods {
    public static void main(String[]args){

        String s1 = "Learning Java";
        String s2 = "Basics";
        System.out.println("Length of the string: " + s1.length());
        System.out.println("Upper case String: " + s1.toUpperCase());
        System.out.println("Concatenate the string: " + s1 +" "+ s2);
        System.out.println("Lower case string: " + s1.toLowerCase());
        System.out.println("Get position: " + s1.charAt(3));
    }
}
