package exercises.ex06_02;

/*
    Ex.06_01
    Author: Karol Kuchnio   
 */
public class Circle implements GeometricObject {
    protected double radius = 1.0;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius = %1$f", radius);
    }
}
