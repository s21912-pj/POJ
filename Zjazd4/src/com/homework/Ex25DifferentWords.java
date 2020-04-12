package com.homework;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/*
    Ex. 25
    Author: Karol Kuchnio   
 */
public class Ex25DifferentWords {

    public static void main(String[] args) throws IOException {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        FileInputStream fstream = new FileInputStream(".//src//TextFile.txt");
        String str = HelperTextReader.readStream(fstream).replaceAll("(\\r\\n)"," ").replaceAll("[,.]", "");
        String[] textArr = str.split(" ");
        for (String text: textArr) {
            words.add(text);
        }
        words.forEach(word -> System.out.print(word.toLowerCase()+" "));
        System.out.println(String.format("\nNumber of words: %s",words.size()));
    }


}



