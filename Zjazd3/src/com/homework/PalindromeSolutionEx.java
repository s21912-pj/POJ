package com.homework;

/*
    HW.Ex 17 Palindrome solution in java.
    Author: Karol Kuchnio   
 */
public class PalindromeSolutionEx {



    public static void main(String[] args) {
        System.out.println(CheckIfStringIsPalindrome("Atak kata"));
        System.out.println(CheckIfStringIsPalindrome("Muzo, raz daj jad za rozum"));
        System.out.println(CheckIfStringIsPalindrome("Wódy żal dla żydów"));
    }


    public static String CheckIfStringIsPalindrome(String value){
        return String.format("Is text palndrome %s : %b",value, isPalindrome(value));
    }

    private static boolean isPalindrome(String stringToCheck) {
        String lowerCaseStr = new String(stringToCheck)
                .toLowerCase()
                .replaceAll(" ", "")
                .replace(",", "")
                .replace(".", "");

        return lowerCaseStr.equals(new StringBuilder(lowerCaseStr).reverse().toString());
    }
}
