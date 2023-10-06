package com.pluralsight;
import java.util.*;
import java.text.DecimalFormat;

public class MortgageCalculator {
    public static void MortgageCalculator(){
        CalculatorSelector cs = new CalculatorSelector();
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner kbScanner = new Scanner(System.in);
        double principal, interestRateDecimal, loanLengthMonths, monthlyPayment, interestPaid, temp = 0.0;

        //Info gathering
        System.out.print("Please enter your principal (loan total): ");
        principal = kbScanner.nextDouble();
        System.out.print("Please enter your interest rate (in percentage): ");
        interestRateDecimal = (kbScanner.nextDouble() / 100 );
        System.out.print("Please enter your loan length (in years): ");
        loanLengthMonths = (kbScanner.nextDouble() * 12);

        //Get monthly payment
        monthlyPayment = principal * (interestRateDecimal / (1 - Math.pow((1 + interestRateDecimal), (-1 * loanLengthMonths))));
        //Get total interest
        interestPaid = (monthlyPayment * loanLengthMonths - principal);

        System.out.println("A $" + df.format(principal) + " loan at " + df.format(interestRateDecimal * 100) + "% for " + df.format(loanLengthMonths / 12 ) + " years would have a $" + df.format(monthlyPayment) + "/ mo payment, with a total interest of $" + df.format(interestPaid) + "!");
        cs.AnotherCalc();

    }
}
