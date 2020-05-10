package com.homework;

import java.util.HashMap;
import java.util.Scanner;

/*
    MimeTypes coding game solution:
    https://www.codingame.com/ide/puzzle/mime-type
    Author: Karol Kuchnio   
 */
public class MimeType {
    public static HashMap<String,String> initMap(Scanner in, int size) {
        HashMap<String,String> map = new HashMap<String,String>();

        for (int i = 0; i < size; i++) {
            String extension = in.next();
            String mimeType = in.next();
            in.nextLine();
            map.put(extension.toLowerCase(),mimeType);
        }
        return map;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        int Q = in.nextInt();
        in.nextLine();
        HashMap<String,String> map = initMap(in,N);
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine();
            String[] res = FNAME.split("\\.");
            if( res.length > 0) {
                String mapRes = map.get(res[(res.length-1)].toLowerCase());
                if ( mapRes != null && res.length > 1 && FNAME.charAt(FNAME.length()-1)!='.'){
                    System.out.println(mapRes);
                } else {
                    System.out.println("UNKNOWN");
                }
            }else{
                System.out.println("UNKNOWN");
            }

        }
    }
}
