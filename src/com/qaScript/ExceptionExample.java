package com.qaScript;

public class ExceptionExample {
    public static void main(String[]args){
        handleArithmeticException(100);
        handleNullPointerException(null);
    }



    private static void handleArithmeticException(int number) {
        try{
            int a = number/0;
        }catch(ArithmeticException exception){
            exception.fillInStackTrace();
        }
    }

    private static void handleNullPointerException(String s) {
        try{
            System.out.println(s.length());
        }catch(NullPointerException ex){
            ex.fillInStackTrace();
        }
    }
}
