package exercises.ex06_06;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    
    Author: Karol Kuchnio   
 */
public class CreateLoans{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer exit=1;
        ArrayList<Loan> loans = new ArrayList();
        int i=1;
        do{
            if(exit!=0) {
                System.out.println("Please enter your prime interest rate:");
                Scanner scanner1 = new Scanner(System.in);
                int userInputRate = scanner.nextInt();

                System.out.println("Please enter your surename:");
                String userName = scanner1.nextLine();
                System.out.println("Please choose type of loan? \n 1. Personal \n 2. Business");
                int inputLoanType = scanner1.nextInt();
                System.out.println("Please enter how much money you want");
                double userAmount = scanner1.nextDouble();
                System.out.println("How long you want pay off it?");
                int userTerm = scanner1.nextInt();
                if (inputLoanType == 1) {
                    loans.add(new PersonalLoan( i++, userName,
                            userAmount, userTerm,
                            userInputRate));
                } else if (inputLoanType == 2) {
                    loans.add(new BusinessLoan(i++, userName,
                            userAmount, userTerm,
                            userInputRate));
                }

                System.out.println("To exit program enter: 0. \nIf you want add another loan enter 1.");
                exit = scanner.nextInt();
                i++;
            }

        }while(exit!=0);
        loans.forEach(x->{
            System.out.println(x.toString());
        });
    }
}
