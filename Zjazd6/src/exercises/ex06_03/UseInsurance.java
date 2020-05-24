package exercises.ex06_03;

import java.util.Scanner;

/*
    Ex. 06_03
    Author: Karol Kuchnio   
 */
public class UseInsurance {

    public static void main(String[] args){
        System.out.println("Select insurance \n 1. Life \n 2. Health");
        Insurance testInsurance;
        Scanner input = new Scanner(System.in);
        Integer inputData = input.nextInt();
        if (inputData==1) {
            testInsurance = new Life();
            testInsurance.display();
        } else if (inputData==2) {
            testInsurance = new Health();
            testInsurance.display();
        } else {
            System.out.println("Please try again, there is no such a option.[Only 1 or 2 available]");
        }
    }
}
