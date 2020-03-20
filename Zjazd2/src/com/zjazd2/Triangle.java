package com.zjazd2;
/*
    Simple Triangle class and methods to calc area etc.
    Author: Karol K   
 */

public class Triangle {
    private float leftSide;
    private float rightSide;
    private float bottomSide;

    public Triangle(float leftSide, float rightSide, float bottomSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.bottomSide = bottomSide;
    }

    static float calcRectangleCircuit(float leftSide, float rightSide, float bottomSide) {
        return (leftSide + rightSide + bottomSide);
    }

    static String isEquilateral(float leftSide, float rightSide, float bottomSide) {
        return (leftSide == rightSide && rightSide == bottomSide)
                ? "Equilateral" : "No equilateral";

    }

    static void calcRectangleArea(float leftSide, float rightSide, float bottomSide) {
        if ((leftSide + rightSide) > bottomSide && (leftSide + bottomSide) > rightSide && (rightSide + bottomSide) > leftSide) {
            float halfCircuit = (leftSide + rightSide + bottomSide) / 2;
            System.out.println(Math.sqrt(halfCircuit * (halfCircuit - leftSide) * (halfCircuit - rightSide) * (halfCircuit - bottomSide)));
        } else
            System.out.println("Area does not exist");
    }

    static String isIsosceles(float leftSide, float rightSide, float bottomSide) {
        return ((leftSide == rightSide && rightSide != bottomSide)
                || (leftSide != rightSide && bottomSide == leftSide)
                || (bottomSide == rightSide && bottomSide != leftSide))
                ? "Isosceles" : "No isosceles";
    }

    static String isScalene(float leftSide, float rightSide, float bottomSide) {
        return (leftSide != rightSide && rightSide
                != bottomSide && bottomSide != leftSide)
                ? "Scalene" : "No scalene";
    }

    public static void main(String[] args) {
        calcRectangleArea(30, 20, 30);
        calcRectangleCircuit(30, 20, 30);
        System.out.println(isEquilateral(10, 10, 10));
        System.out.println(isIsosceles(10, 20, 10));
        System.out.println(isScalene(10, 20, 30));
    }

    public float getleftSide() {
        return leftSide;
    }

    public void setleftSide(float leftSide) {
        this.leftSide = leftSide;
    }

    public float getrightSide() {
        return rightSide;
    }

    public void setrightSide(float rightSide) {
        this.rightSide = rightSide;
    }

    public float getbottomSide() {
        return bottomSide;
    }

    public void setbottomSide(float bottomSide) {
        this.bottomSide = bottomSide;
    }
}
