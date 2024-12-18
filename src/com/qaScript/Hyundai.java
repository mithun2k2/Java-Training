package com.qaScript;

public class Hyundai extends Car{
    public static void main(String[]args){
        start();
        accelerator();
        brakes();
    }

    public static void brakes(){
        System.out.println("Press te brakes");
    }

    public static void start(){
        String key = "On";
        System.out.println("Turn the key " + key);
    }
}
