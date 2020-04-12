package com.homework;

/*
    Ex.23
    Author: Karol Kuchnio   
 */
public class Square extends Rectangle {

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square() {
        super();
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    @Override
    public void setHeight(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return String.format("Square[Rectangle[Shape[color=%s,filled=%s],width=%.2f,height=%.2f]]",
                this.getColor(), this.isFilled(), this.getWidth(), this.getHeight());
    }
}
