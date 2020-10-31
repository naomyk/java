package com.naomysam;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MONTHS = 12;
        final  int PERCENT =100;
        int principal = 100000;
        while (true) {
            System.out.print("principal");
           principal= scanner.nextInt();
            if (principal >1000 && principal<1000_000)
                break;
            System.out.println("enter a value between 1000 and 1000_000");
        }
        double annualInterestRate = 3.92;
        while (true){
            System.out.print("annual interest rate");
            annualInterestRate= scanner.nextDouble();
            if (annualInterestRate > 0 && annualInterestRate<=30)
                break;
            System.out.println("enter a value between 1 and 30");

        }
        double monthlyInterestRate = annualInterestRate/(MONTHS*PERCENT);
        int periodInYears = 30;
        while (true ){
            System.out.print("period in years");
            periodInYears =scanner.nextInt();
            if ( periodInYears >1 && periodInYears<= 30)
                break;
                System.out.println("enter a value between 1 and 30");
        }
        int periodInMonths = periodInYears*MONTHS;
        double numerator =( Math.pow((monthlyInterestRate+1),periodInMonths))* monthlyInterestRate;
        double denominator =( Math.pow((monthlyInterestRate+1),periodInMonths))- 1;
        double result = principal * ( numerator/denominator);
        System.out.print( " mortgage");
        String  mortgage = NumberFormat.getCurrencyInstance().format(result);
        System.out.println(mortgage);

    }

}

