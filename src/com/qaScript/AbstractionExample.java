package com.qaScript;

public class AbstractionExample {
    public static void main(String[]args){
        Shape circle = new Circle(4.5);
        Shape rectangle = new Rectangle(5.5, 7.8);
        Shape triangle = new Triangle(3.7, 6.7);

        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the triangle: " + triangle.calculateArea());
    }
}
