package com.company;

import java.util.Scanner;

public class Pyramid {

    public void StartPrintingPyramid(){
        PyramidPrinter(Input());
    }

    private void PyramidPrinter(int size){
        int oddNum = 1; // assign oddNumber to var
        int numberOfSpaces = size - 1;

        for (int i = 1; i <= size; i++) {

            char character = '`';
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= oddNum; j++) {
                if (j <= i)
                {
                    character++;
                } else
                {
                    character--;
                }

                System.out.print(character);
            }
            System.out.println();
            oddNum += 2;
            numberOfSpaces--;
        }
    }

    /*Read input*/
    private int Input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Pass size of pyramid: ");
        return  input.nextInt();

    }
}
