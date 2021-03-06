package com.homework;

/*
    HW. ex: 11
    Employee model based on UML chart.
    Author: Karol Kuchnio   
 */
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int value) {
        this.salary = value;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(double percentage) {
        return (this.salary *= (1 + percentage / (double) 100));
    }

    @Override
    public String toString() {
        return String.format("Employee[id=%d,name=%s,salary=%d]", this.getId(), this.getName(), this.getSalary());
    }
}