package com.homework;

/*
    Ex 5_01
    Author: Karol Kuchnio   
 */
public class MyPoint {

    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x,y};
    }
    public void setXY(int x,int y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append(x);
        sb.append(",").append(y);
        sb.append(')');
        return sb.toString();
    }

    public double distance(int x, int y){
        return Math.sqrt((Math.pow((x - getX()), 2) + (Math.pow((y - getY()), 2))));
    }
    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(x - another.x, 2) + Math.pow(y - another.y, 2));
    }
    public double distance() {
        return Math.sqrt((Math.pow(x, 2) + (Math.pow(y, 2))));
    }
}
