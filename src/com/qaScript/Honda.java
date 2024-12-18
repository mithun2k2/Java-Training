package com.qaScript;

public class Honda extends Bike{
    void run(){
        System.out.println("Honda run's 315 m/h");
    }

    public static void main(String[]args){
        Honda honda = new Honda();
        honda.run();
    }
}
