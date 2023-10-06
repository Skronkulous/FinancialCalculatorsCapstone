package com.pluralsight;
import java.util.*;
import java.text.DecimalFormat;
public class PresentValueCalculator {
    public static void PresentValueCalculator(){
        CalculatorSelector cs = new CalculatorSelector();
        DecimalFormat dc = new DecimalFormat("#.00");
        Scanner kbScanner = new Scanner(System.in);
        double monthlyPayout, interestRateDecimal, years, presentValue;

        System.out.print("Please enter your monthly payout: ");
        monthlyPayout = kbScanner.nextDouble();
        System.out.print("Please enter your expected interest rate (in percentage): ");
        interestRateDecimal = (kbScanner.nextDouble() / 100);
        System.out.print("Please enter the number of years compounded: ");
        years = kbScanner.nextDouble();

        //presentValue = ((Math.pow(monthlyPayout, (1/(365 * years))) / (1 + (interestRateDecimal / (365 * years)))));
        presentValue = monthlyPayout * ((1 - Math.pow((1 + (interestRateDecimal / 12 )), (-1 * (years * 12)))) / (interestRateDecimal / 12));
        System.out.print("To fund an annuity that pays $" + dc.format(monthlyPayout) + " monthly for " + (int)years + " years and earns an expected " + dc.format(interestRateDecimal * 100) + "% interest, you would need to invest $" + dc.format(presentValue) + " today!");
        cs.AnotherCalc();
    }
}
