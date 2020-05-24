package exercises.ex06_06;

import java.math.BigDecimal;
import java.util.InputMismatchException;

/*
    Part 1
    Author: Karol Kuchnio   
 */
public abstract class Loan implements LoanConstants {
     private int loanNumber;
     private String customerLastName;
     private double amountOfLoan;
     private double interestRate;
     private int term;

    public Loan(int loanNumber, String customerLastName, double amountOfLoan, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        try {
            if (amountOfLoan> maxAmount || amountOfLoan < 1) {
                throw new InputMismatchException("Loan amount must be greater than 1 and less than:"+maxAmount);
            } else {
                this.amountOfLoan = amountOfLoan;
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        if (term != shortTerm && term != mediumTerm && term != longTerm) {
            this.term = term;
        } else this.term = term;
    }


    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Loan{");
        sb.append("loanNumber=").append(loanNumber);
        sb.append(", customerLastName='").append(customerLastName).append('\'');
        sb.append(", amountOfLoan=").append(amountOfLoan);
        sb.append(", interestRate=").append(interestRate);
        sb.append(", term=").append(term);
        sb.append('}');
        return sb.toString();
    }
}
