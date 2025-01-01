package com.qaScript;

import java.sql.SQLOutput;

public class JacketFinder {
    public static boolean checkForJacket(String[]list) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == "jacket") {
                return true;
            }
        }
        return false;
    }

    public static void main(String[]args){
        String[]suitcase = {"shirt", "jacket", "pants", "socks"};
        System.out.println(checkForJacket(suitcase));
    }
}
