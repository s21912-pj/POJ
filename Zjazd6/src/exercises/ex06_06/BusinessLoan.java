package exercises.ex06_06;

import java.math.BigDecimal;

/*
    
    Author: Karol Kuchnio   
 */
public class BusinessLoan extends Loan {

    public BusinessLoan(int loanNumber, String customerLastName, double amountOfLoan, int term,double interestRate) {
        super(loanNumber, customerLastName, amountOfLoan, term);
        super.setInterestRate(interestRate*1.01);

    }
}
