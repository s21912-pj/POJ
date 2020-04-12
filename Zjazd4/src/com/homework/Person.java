package com.homework;

/*
    Ex.20 - Person model.
    Author: Karol Kuchnio   
 */
public class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String value) {
        this.address = value;
    }
    @Override
    public String toString() {
        return String.format("Person[name=%s,address=%s]", this.getName(), this.getAddress());
    }
}