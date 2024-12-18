package com.qaScript;

public class Car {

        private String color;
        private int size;
        private double weight;
   
        public static void start(){
            System.out.println("Press the start key");
        }

        public static void accelerator(){
            System.out.println("Press the accelerator");
        }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void displayCar(){
        System.out.println("Color of the car is: " + color);
        System.out.println("Size of the car is: " + size);
        System.out.println("Weight of the car is: " + weight);
    }
}
