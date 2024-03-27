package com.cxl.ch4;

public class TrapezoidTest {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.lower = 10;
        trapezoid.upper = 5;
        trapezoid.heights = 5;
        double area = trapezoid.getAres();
        System.out.println("area="+ area);
    }
}
