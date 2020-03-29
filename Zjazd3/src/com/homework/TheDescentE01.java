package com.homework;

import java.util.Scanner;

/*
    Ex.17 Coding Game nr 2: The Descent
    Author: Karol Kuchnio   
 */public class TheDescentE01 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int maxMountainH = 0; // highest mount 0-9
        int maxMountainX = 0; // highest mount number 0-7
        // game loop
        while (true) {
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if (maxMountainH <= mountainH) {
                    maxMountainH = mountainH;
                    maxMountainX = i;
                }
            }
            System.err.println(maxMountainH);
            System.out.println(maxMountainX); // The index of the mountain to fire on.
            maxMountainH = 0; //zeroig for the next loop
            maxMountainX = 0;
        }
    }
}
