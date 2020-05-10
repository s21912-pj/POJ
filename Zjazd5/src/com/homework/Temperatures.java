package com.homework;

import java.util.Scanner;

/*
    Coding Game: Temperature
    In this exercise, you have to analyze records of temperature to find the closest to zero.
    https://www.codingame.com/ide/puzzle/temperatures
    Author: Karol Kuchnio   
 */public class Temperatures {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if (n == 0) {
            System.out.println("0");
            return;
        }
        in.nextLine();
        String[] temps = in.nextLine().split(" ");
        int minimum = Integer.parseInt(temps[0]);
        for (String stringTemp : temps) {
            int temp = Integer.parseInt(stringTemp);
            if (Math.abs(temp) < Math.abs(minimum) || (0 < temp && -minimum == temp)) {
                minimum = temp;
            }
        }
        System.out.println(minimum);
    }
}
