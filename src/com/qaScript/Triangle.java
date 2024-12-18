package com.qaScript;

public class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea(){
        return .5 * base * height;
    }
}