package com.homework;

/*
    Ex 5_03
    Author: Karol Kuchnio   
 */
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1,int y1, int x2,int y2, int x3,int y3) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyTriangle[");
        sb.append("v1=").append(v1);
        sb.append(", v2=").append(v2);
        sb.append(", v3=").append(v3);
        sb.append(']');
        return sb.toString();
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double distance1 = v1.distance(v2);
        double distance2 = v2.distance(v3);
        double distance3 = v3.distance(v1);

        if (distance1 == distance2 && distance1 == distance3) {
            return "Is Equilateral";
        } else if (distance1 != distance2 && distance2 != distance3 && distance3 != distance1) {
            return "Is Scalene";
        } else {
            return "Is Isosceles";
        }
    }
}
