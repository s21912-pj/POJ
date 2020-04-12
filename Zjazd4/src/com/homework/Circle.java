package com.homework;

/*
    Ex.23
    Author: Karol Kuchnio   
 */
public class Circle extends Shape {

    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius = 1.0F;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    public double getPerimeter() {
        return 2.0F * Math.PI * this.getRadius();
    }
    @Override
    public String toString() {
        return String.format("Circle[Shape[color=%s,filled=%s],radius=%.2f]", this.getColor(),
                this.isFilled(), this.radius);
    }

}
