package com.homework;

import java.util.*;

/*
    Ex. 5_07
    Author: Karol Kuchnio   
 */
public class StatisticExercise {

    private static List<Integer> grList = new ArrayList<Integer>();

    public void InvokeMethod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = Integer.parseInt(input.nextLine());
        for (int i = 1; i <=numberOfStudents ; i++) {
            System.out.println("Enter the grade for student "+i);
            int value = doesValueFit(Integer.parseInt(input.nextLine()));
            if(value!=0){
                grList.add(value);
            }else{
                i--;
            }

        }
        System.out.println("The grades are:"+grList);
        System.out.printf("The average is:%.2f\n", new Double(average()));
        System.out.println("The median is:"+median());
        System.out.println("The minimum is:" +min());
        System.out.println("The maximum is:" +max());
        System.out.printf("The standard deviation is:%.2f",new Double(deviation()));
    }
    public List<Integer> getGrades() {
        return grList;
    }

    public float sum() {
        float total = 0;
        for (float i = 0; i < getGrades().size(); i++) {
            total = total + grList.get((int) i);
        }
        return total;
    }

    public float average() {
        return sum() / getGrades().size();
    }

    public float median() {
        int length = grList.size();
        int mean = (length - 1) / 2;

        if (length % 2 == 0) {
            return (grList.get(mean) + grList.get(mean + 1)) >> 1;
        } else {
            return grList.get(mean);
        }
    }

    public int min() {
        return Collections.min(grList);
    }

    public int max() {
        return Collections.max(grList);
    }

    public float deviation() {
        double stdDeviation = 0.0;
        double mean = sum() / grList.size();
        for (double num : grList) {
            stdDeviation += Math.pow(num - mean, 2);
        }
        return (float) Math.sqrt(stdDeviation / grList.size());
    }

    private int doesValueFit(int value){
        if(value>0&&value<100){
            return value;
        }else{
            System.out.println("Value should be between 0 and 100. Please try again.");
            return 0;
        }
    }
}
