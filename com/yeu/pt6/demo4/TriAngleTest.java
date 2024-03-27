package pt6.demo4;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle triangle = new TriAngle(5.0, 7.0);

        double base = triangle.getBase();
        double height = triangle.getHeight();
        double area = calculateArea(base, height);

        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area of the triangle: " + area);
    }

    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}


