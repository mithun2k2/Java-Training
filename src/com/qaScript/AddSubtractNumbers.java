package com.qaScript;

public class AddSubtractNumbers {
    public static void main(String[]args){
        addNumbers(4,8);
        addNumbers(10,99);
        addNumbers(100,200);

        subtractNumbers(299, 235);
        subtractNumbers(301,302);
        subtractNumbers(201, 200);

        int res1 = subtractNumbers(501,305);
        int output = res1 + 100;
        System.out.println("Subtract of two numbers: " + output);
    }

    public static void addNumbers(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Addition of two numbers: " + result);
    }

    public static int subtractNumbers(int num1, int num2){
        int result1 = num1-num2;
        System.out.println("Subtraction of two numbers: " + result1);
        return result1;
    }
}

