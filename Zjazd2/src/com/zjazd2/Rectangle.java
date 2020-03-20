package com.zjazd2;
/*
    Rectangle class and methods to calc: area,circuit,diagonal
    Author: Karol K   
 */

public class Rectangle {
    private float lenght;
    private float width;

    public Rectangle(float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    static float calcRectangleArea(float lenght, float width) {
        return lenght * width;
    }

    static float calcRectangleCircuit(float lenght, float width) {
       return (2 * lenght + 2 * width);
    }

    static double calcRectangleDiagonal(float lenght, float width) {
       return Math.sqrt((Math.pow(lenght, 2) + Math.pow(width, 2)));
    }

    public static void main(String[] args) {
        System.out.printf("Rectangle area is: %.2f %n", calcRectangleArea(5, 10));
        System.out.printf("Rectangle circuit is: %.2f %n", calcRectangleCircuit(5, 10));
        System.out.printf("Rectangle diagonal is: %.2f %n", calcRectangleDiagonal(5, 10));
    }
}