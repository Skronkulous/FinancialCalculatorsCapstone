package com.pluralsight;
import java.util.*;
import java.text.DecimalFormat;

public class FutureValueCalculator {
    public static void FutureValueCalculator(){
        CalculatorSelector cs = new CalculatorSelector();
        DecimalFormat dc = new DecimalFormat("#.00");
        Scanner kbScanner = new Scanner(System.in);
        double deposit, interestRateDecimal, years, newDepositTotal, interestTotal;

        System.out.print("Please enter your CD deposit: ");
        deposit = kbScanner.nextDouble();
        System.out.print("Please enter your interest rate (in percentage): ");
        interestRateDecimal = (kbScanner.nextDouble() / 100);
        System.out.print("Please enter the number of years compounded: ");
        years = kbScanner.nextDouble();

        newDepositTotal = (deposit * Math.pow(1 + (interestRateDecimal / 365), (365 * years)));
        interestTotal = (newDepositTotal - deposit);
        System.out.print("Depositing $" + dc.format(deposit) + " into a CD that earns " + dc.format(interestRateDecimal * 100) + "% interest and matures in " + (int)years + " years, your CD's ending balance will be $" + dc.format(newDepositTotal) + " and you would have earned $" + dc.format(interestTotal) + " in interest! ");
        cs.AnotherCalc();
    }
}
