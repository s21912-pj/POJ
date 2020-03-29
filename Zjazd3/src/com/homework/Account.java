package com.homework;

/*
    HW:Ex. 13
    Account model based on UML chart
    Author: Karol Kuchnio   
 */
public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= balance)
            this.balance -= amount;
        else
            System.out.println("Amount exceeded balance");
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            //or like: this.balance = this.balance - amount
            this.balance -= amount;
            //or like: another.balance = another.balance + amount
            another.balance += amount;
        } else
            System.out.println("Amount exceeded balance");
        return this.balance;
    }
    @Override
    public String toString() {
        return String.format("Account[id=%s,name=%s,balance=%d]", this.getId(), this.getName(), this.getBalance());
    }

}