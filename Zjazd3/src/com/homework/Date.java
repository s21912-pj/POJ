package com.homework;

/*
    HW. Ex 14.
    Date model based on UML chart.
    Author: Karol Kuchnio   
 */
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int value) {
        this.day = value;
    }

    public void setMonth(int value) {
        this.month = value;
    }

    public void setYear(int value) {
        this.year = value;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s", String.format("%02d", day), String.format("%02d", month), year);
    }

}