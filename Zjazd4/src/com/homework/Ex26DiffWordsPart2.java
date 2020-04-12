package com.homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/*
    Ex.26
    Author: Karol Kuchnio   
 */
public class Ex26DiffWordsPart2 {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> words = new HashMap<>();
        FileInputStream fstream = new FileInputStream(".//src//TextFile.txt");
        String str = HelperTextReader.readStream(fstream).replaceAll("(\\r\\n)"," ").replaceAll("[,.]", "").toLowerCase();
        String[] textArr = str.split(" ");
        for (String text: textArr) {
            if ( words.containsKey(text)) {
                int count = words.get(text);
                words.put(text, count+1);
            } else {
                words.put(text, 1);
            }
        }
        ArrayList arr = new ArrayList();
        for (String key: words.keySet()) {
            arr.add(key.toLowerCase()+"="+words.get(key));
        }
        System.out.println(arr);
        System.out.println("What is most frequent word in Shakespeare’s Hamlet?");
        System.out.println("One of the most used words in Hamlet is 'madness' or words associated with this.");
    }
}
