package com.homework;

/*
    Data model for Ex 16.
    Author: Karol Kuchnio   
 */
public class Exercise16DataModel extends Employee {
    public Exercise16DataModel(int id, String firstName, String lastName, int salary,Date joiningDate) {
        super(id, firstName, lastName, salary);
        this.joiningDate = joiningDate;
    }

    private Date joiningDate;

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date date) {
        this.joiningDate = date;
    }
}
