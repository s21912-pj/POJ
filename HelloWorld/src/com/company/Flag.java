package com.company;

import java.util.Scanner;

public class Flag {


    public void Start(){
        System.out.println("Write size of FLAG: S,M,L and hit ENTER");
        Scanner sc = new Scanner(System.in);
        String flagSize = sc.nextLine();
        FlagSize size = ConvertInput(flagSize);
        if(size!=null) {
            PrintFlag(size);
        }else{
            System.out.println("Uncorrect size, should be: S.M,L");
        }
    }
    private void PrintFlag(FlagSize flagSize){
        GenerateFlag(flagSize);
    }
    private FlagSize ConvertInput(String input){
        switch (input){
            case "S":
                return FlagSize.SMALL;
            case "M":
                return FlagSize.MEDIUM;
            case "L":
                return  FlagSize.LARGE;
            default:
                return null;
        }
    }

    private void GenerateFlag(FlagSize flagSize){
        int value = flagSize.getValue();
        String character = " ";
        for (int i = 0; i < value; i++)
        {
            for (int j = 0; j < (value * 3); j++)
            {
                if (i == 0 || i == (value - 1)|| j == 0 || j == ((value * 3)-1))
                {
                    System.out.print('*');

                }else if (i==((value/2))|| j == 0)
                {
                    System.out.print(character="#");
                }
                else
                {
                    System.out.print(character);
                }
            }
            System.out.println();
        }
    }

}

