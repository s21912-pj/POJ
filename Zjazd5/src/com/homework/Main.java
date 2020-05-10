package com.homework;

import java.awt.*;
import java.util.Arrays;

/*
    Class to invoke test operations from com.homework package
    Ex 5_01
    Author: Karol Kuchnio
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("//Ex 5_01");
        MyPoint[] pts = new MyPoint[10];
        for (int i = 0; i < pts.length; i++) {
            pts[i] = new MyPoint(i + 1, i + 1);
        }
        String myPointsArrays = Arrays.toString(pts);
        System.out.println(myPointsArrays);

        System.out.println("//Ex 5_02");
        MyCircle circle = new MyCircle();
        System.out.println(circle.distance(new MyCircle(new MyPoint(2,4),4)));

        System.out.println("//Ex 5_03");
        MyTriangle myTriangle = new MyTriangle(new MyPoint(4,5),
                                                new MyPoint(8,8),
                                                new MyPoint(2,2));
        System.out.println("Permimeter:"+ myTriangle.getPerimeter());
        System.out.println("Types:"+ myTriangle.getType());
        System.out.println("//Ex 5_04");
        MyRectangle myRectangle = new MyRectangle(4,6,7,8);
        System.out.println("Diagonal:"+myRectangle.getDiagonal());
        System.out.println("Permimeter:"+myRectangle.getPerimeter());
        System.out.println("//Ex 5_05");
        Invoice invoice = new Invoice(4,new Customer(4,"Marek",25),100);
        System.out.println("Before discount:"+ invoice.getAmount());
        System.out.println("After discount"+invoice.getAmountAfterDiscount());

        System.out.println("//Ex 5_07");
        StatisticExercise statisticExercise = new StatisticExercise();
        statisticExercise.InvokeMethod();
    }
}
