package com.company;

import java.util.Scanner;
//Calculate your BMI
public class BMI {

    public void StartCalculate() {
        CalculateBMI();
    }

    private void CalculateBMI(){
        System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Please enter your height in cm: ");
        float height = s.nextFloat();

        //  100*100 for cm to m conversion
        float bmiValue = (100*100*weight)/(height*height);

        System.out.println("Your BMI is: "+bmiValue);
        PrintCategory(bmiValue);
    }

    /*Prints BMI category*/
    private void PrintCategory(float bmiValue) {
        if(bmiValue < 18.5) {
            System.out.println("You are underweight");
        }else if (bmiValue < 25) {
            System.out.println("You are normal");
        }else if (bmiValue < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }
    }
}
