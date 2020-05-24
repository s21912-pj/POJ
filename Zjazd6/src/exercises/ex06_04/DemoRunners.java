package exercises.ex06_04;



import java.util.Scanner;

/*
    Ex.06_04
    Author: Karol Kuchnio   
 */
public class DemoRunners {
    public static void main(String[] args){
        System.out.println("Select option to run \n 1. Athlete \n 2. Machine \n 3. Political Candidate");
        Runner runner;
        Scanner input = new Scanner(System.in);
        Integer inputData = input.nextInt();
        if (inputData==1) {
            runner = new Athlete();
            System.out.printf("Type of runner:%s",runner.run());
        }else if (inputData==2) {
            runner = new Machine();
            System.out.printf("Type of runner:%s",runner.run());
        } else if(inputData==3){
            runner = new PoliticalCandidate();
            System.out.printf("Type of runner:%s",runner.run());
        }else {
            System.out.println("Please try again, there is no such a option.[Only 1,2 or 3 available]");
        }
    }
}
