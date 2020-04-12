package com.homework;

/*
    Ex.24
    Author: Karol Kuchnio   
 */
public class Ex24ArmStrong {

    public static boolean IsArmStrongNumber(int number){
        return CheckIsArmStrongNumber(number);
    }
    private static boolean CheckIsArmStrongNumber(int num) {
        char[] numInChars = String.valueOf(num).toCharArray();
        int sum = 0;
        for (char ch : numInChars) {
            int charInInt = Integer.parseInt(String.valueOf(ch));
            int charSum = charInInt;
            for (int i = 0; i < numInChars.length - 1; i++)
                charSum *= charInInt;
            sum += charSum;
        }
        return num == sum;
    }
}
