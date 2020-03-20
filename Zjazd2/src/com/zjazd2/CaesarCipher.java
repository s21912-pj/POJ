package com.zjazd2;

/*
    Simple caesar cipher impl
    Author: Karol K
 */
public class CaesarCipher {

    public static String encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)) == true) {
                AddUpperCase(result, i, s, text);
            } else {
                AddNotUpperCase(result, i, s, text);
            }
        }
        return result.toString();
    }

    private static void AddUpperCase(StringBuffer result, int index,int shift,String text ){
        char ch = (char)(((int)text.charAt(index) +
                shift - 65) % 26 + 65);
        result.append(ch);

    }

    private static void AddNotUpperCase(StringBuffer result, int index,int shift,String text ){
        char ch = (char)(((int)text.charAt(index) +
                shift - 97) % 26 + 97);
        result.append(ch);
    }

    public static void main(String[] args) {
        System.out.println("Encode by cipher: "+CaesarCipher.encrypt( "Karol Kuchnio",4));
    }

}
