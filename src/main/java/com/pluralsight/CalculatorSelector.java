package com.pluralsight;
import java.util.*;

public class CalculatorSelector {
    public static void main(String[] args) {
        CalculatorSelector();
    }

    public static void CalculatorSelector() {
        PresentValueCalculator pvc = new PresentValueCalculator();
        MortgageCalculator mc = new MortgageCalculator();
        FutureValueCalculator fvc = new FutureValueCalculator();

        while (1 > 0) {
            Scanner kbScanner = new Scanner(System.in);

            System.out.print("Calculator Options: \n     1) Mortgage Calculator\n     2) Future Value Calculator\n     3) Present Value Calculator\nPlease select the calculator you would like to use (1, 2, or 3): ");
            String choice = kbScanner.nextLine();

            if (choice.equals("1")) {
                mc.MortgageCalculator();
                break;
            }
            else if (choice.equals("2")) {
                fvc.FutureValueCalculator();
                break;
            }
            else if (choice.equals("3")) {
                pvc.PresentValueCalculator();
                break;
            }
            else{
                System.out.println("\nPlease select a valid option. (1, 2 or 3) \n");
                CalculatorSelector();
                break;
            }
        }
    }

    public static void AnotherCalc(){
        Scanner kbScanner = new Scanner(System.in);
        System.out.print("\nWould you like to continue? (Y/N): ");
        String option = kbScanner.nextLine();

        if(option.equalsIgnoreCase("y")){
            System.out.println("");
            CalculatorSelector();
        }
        else if (option.equalsIgnoreCase("n")){
            System.out.println("Thank you for using the calculator! ");
        }
        else{
            System.out.println("\nPlease enter a valid command (Y/N).\n");
        }
    }
}
