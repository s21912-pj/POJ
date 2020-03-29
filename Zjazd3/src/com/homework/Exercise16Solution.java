package com.homework;

import java.util.ArrayList;

/*
    Solved Ex 16.
    Author: Karol Kuchnio   
 */
public class Exercise16Solution {
    public static void main(String[] args) {
        ArrayList<Exercise16DataModel> arrayList = new ArrayList<>();
        GenerateData(arrayList);
        for (Exercise16DataModel data: arrayList) {
            System.out.println(String.format("Name: %s, Salary: %d, Joining date %s", data.getName(),
                    data.getSalary(), data.getJoiningDate().toString()));
        }

    }

    public static void GenerateData(ArrayList<Exercise16DataModel> arrayList){
        arrayList.add(new Exercise16DataModel(1,"Marek","Kowalski",3500,new Date(2,5,2014)));
        arrayList.add(new Exercise16DataModel(2,"Karol","Nowak",3500,new Date(2,5,2019)));
        arrayList.add(new Exercise16DataModel(3,"Adam","Poznow",4500,new Date(1,3,2012)));
        arrayList.add(new Exercise16DataModel(4,"Zenon","Kokos",6000,new Date(2,2,2017)));
        arrayList.add(new Exercise16DataModel(5,"Baron","Nowak",1500,new Date(15,5,2014)));
        arrayList.add(new Exercise16DataModel(6,"Fritz","Bors",3000,new Date(2,8,2013)));
        arrayList.add(new Exercise16DataModel(7,"Sergii","Zahyr",3500,new Date(8,5,2016)));
        arrayList.add(new Exercise16DataModel(8,"Amol","Zaix",2500,new Date(2,1,2011)));
    }
}
