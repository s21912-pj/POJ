package com.homework;

import java.awt.*;

/*
    Ex 05_02
    Author: Karol Kuchnio   
 */
public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public MyCircle(){
       this.center = new MyPoint(0,0);
       this.radius =0;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY(){
        return center.getXY();
    }

    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyCircle[");
        sb.append("radius=").append(radius);
        sb.append(", center=").append(center.toString());
        sb.append(']');
        return sb.toString();
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
