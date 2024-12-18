package com.qaScript;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[]args){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(500);

        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
    }
}
