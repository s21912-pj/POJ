package com.homework;

/*
    Ex. 5_04
    Author: Karol Kuchnio   
 */
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint rightBottom;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.rightBottom = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint rightBottom) {
        this.topLeft = topLeft;
        this.rightBottom = rightBottom;
    }

    public double getWidth() {
        return topLeft.getY() - rightBottom.getY();
    }

    public double getLength() {
        return rightBottom.getX() - topLeft.getX();
    }

    public double getDiagonal() {
        return topLeft.distance(rightBottom);
    }

    public double getPerimeter() {
        return (getWidth() + getLength())*2;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyRectangle[");
        sb.append("topLeft=").append(topLeft);
        sb.append(", rightBottom=").append(rightBottom);
        sb.append(']');
        return sb.toString();
    }
}
