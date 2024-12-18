package com.qaScript;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[]args){

        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2,"Python");
        languages.put(3, "React");

        System.out.println(languages);

        if(languages.containsKey(1)){
            System.out.println(languages.get(1));
        }
        if(!languages.isEmpty()){
            System.out.println("HashMap contains mapping");
        }

        languages.remove(3);
        System.out.println(languages);
    }
}
