package com.cxl.ch3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle= new Circle();
        circle.radius=10;
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();
        System.out.println("area="+area);
        System.out.printf("perimeter=%.2f",perimeter);
    }
}
