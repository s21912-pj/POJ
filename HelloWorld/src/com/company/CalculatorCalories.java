package com.company;

import java.util.Scanner;
//Calculate how much calories you should eat per day
public class CalculatorCalories {

    private static final double LIGHT_ACTIVITY_FACTOR = 1.375;
    private static final int MALE_BMR_CONSTANT = 66;
    private static final int FEMALE_BMR_CONSTANT = 655;
    private static final double MALE_WEIGHT_COEFFICIENT = 6.23;
    private static final double FEMALE_WEIGHT_COEFFICIENT = 4.35;
    private static final double MALE_HEIGHT_COEFFICIENT = 12.7;
    private static final double FEMALE_HEIGHT_COEFFICIENT = 4.7;
    private static final double MALE_AGE_COEFFICIENT = 6.8;
    private static final double FEMALE_AGE_COEFFICIENT = 4.7;



    public void PrintHowMuchYouNeedCalories(){
       try {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter your gender(male/female):");
           String gender = input.nextLine();
           System.out.println("Sport (YES) if no pass any other:");
           String active = input.nextLine();
           System.out.println("Enter your weight:");
           double weight = input.nextDouble();
           System.out.println("Enter your height:");
           int height = input.nextInt();
           System.out.println("Enter your age:");
           int age = input.nextInt();
           System.out.printf("Value: %.2f", CalculateCalories(gender,weight,height,age,active));
       }catch (Exception ex){
           System.out.println("Incorrect data provided, try again and enter correct data.");
       }


    }


    private  double CalculateCalories(String gender, double weight,int height, int age, String active) throws Exception {
        double lightActivityFactor  = active.toLowerCase() == "yes" ? LIGHT_ACTIVITY_FACTOR : 1;
        if(gender.toLowerCase()=="male"){
            return  CalculateForMan(weight,height,age,lightActivityFactor);
        }else if(gender.toLowerCase()=="female"){
            return CalculateForWoman(weight,height,age,lightActivityFactor);
        }else{
            throw new Exception();
        }
    }

    private double CalculateForMan(double weight, int height, int age, double activityFactor){

        return (MALE_BMR_CONSTANT+(MALE_WEIGHT_COEFFICIENT*weight)+(MALE_HEIGHT_COEFFICIENT*height)+(MALE_AGE_COEFFICIENT*age))*activityFactor;
    }
    private double CalculateForWoman(double weight, int height, int age,double activityFactor){

        return (FEMALE_BMR_CONSTANT+(FEMALE_WEIGHT_COEFFICIENT*weight)+(FEMALE_HEIGHT_COEFFICIENT*height)+(FEMALE_AGE_COEFFICIENT*age))*activityFactor;
    }
}

/*
Women:
Daily Calorie Requirement for Light Activity = 1.375 * BMR (Basal Metabolic Rate)
BMR = 655 + ( 4.35 x weight in pounds ) + ( 4.7 x height in inches ) - ( 4.7 x age in years )

Men:
Daily Calorie Requirement for Light Activity = 1.375 * BMR (Basal Metabolic Rate)
BMR = 66 + ( 6.23 x weight in pounds ) + ( 12.7 x height in inches ) - ( 6.8 x age in year )


Based on http://www.bmi-calculator.net/bmr-calculator/harris-benedict-equation/
*/