package com.homework;

import java.util.Scanner;

/*
    Ex.17 Coding Game nr 1: Shadow Of The Knight E01
    Author: Karol Kuchnio   
 */public class ShadowOfTheKnightE01 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        int x = X0; // x is eaier than X0
        int y = Y0; //y is easier than Y0

        int xMin = -1;
        int xMax = W;
        int yMax = H;
        int yMin = -1;


        // game loop
        while (true) {
            String bombDir = in.next();

            if(bombDir.equals("U")){
                yMax = y;
                System.out.println(x + " " + (y-((yMax-yMin)/2)));
                y = (y-((yMax-yMin)/2));
            }
            else if(bombDir.equals("D")){
                yMin = y;
                System.out.println(x + " " + (y+((yMax-yMin)/2)));
                y = (y+((yMax-yMin)/2));

            }
            else if(bombDir.equals("L")){
                xMax = x;
                System.out.println((x-((xMax-xMin)/2)) + " " + y);
                x = (x-((xMax-xMin)/2));
            }
            else if(bombDir.equals("R")){
                xMin = x;
                System.out.println((x+((xMax-xMin)/2)) + " " + y);
                x = (x+((xMax-xMin)/2));
            }
            else if(bombDir.equals("UR")){
                xMin = x;
                yMax = y;
                System.out.println((x+((xMax-xMin)/2)) + " " + (y-((yMax-yMin)/2)));
                x = (x+((xMax-xMin)/2));
                y = (y-((yMax-yMin)/2));
            }
            else if(bombDir.equals("UL")){
                xMax = x;
                yMax = y;
                System.out.println((x-((xMax-xMin)/2)) + " " + (y-((yMax-yMin)/2)));
                x = (x-((xMax-xMin)/2));
                y = (y-((yMax-yMin)/2));
            }
            else if(bombDir.equals("DR")){
                xMin = x;
                yMin = y;
                System.out.println((x+((xMax-xMin)/2)) + " " + (y+((yMax-yMin)/2)));
                x = (x+((xMax-xMin)/2));
                y = (y+((yMax-yMin)/2));
            }
            else if(bombDir.equals("DL")){
                xMax = x;
                yMin = y;
                System.out.println((x-((xMax-xMin)/2)) + " " + (y+((yMax-yMin)/2)));
                x = (x-((xMax-xMin)/2));
                y = (y+((yMax-yMin)/2));
            }

        }
    }
}
