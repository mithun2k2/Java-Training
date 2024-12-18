package com.qaScript;

public class Audi {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setColor("Red");
        audi.setSize(60);
        audi.setWeight(21.14);
        audi.displayCar();

        Car.accelerator();
        Car.start();

        displayLogo("A");
        displayLogo(100);
    }
    // Method overloading
    public static void displayLogo(String s1) {
        System.out.println("Logo is " + s1);
    }
    // Method overloading
    public static void displayLogo(int s) {
        System.out.println("Logo is " + s);
    }
}
