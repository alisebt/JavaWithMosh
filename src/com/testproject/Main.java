package com.testproject;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate:");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterest = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years):");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;

        double mor = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        System.out.print("Mortgage:" + NumberFormat.getCurrencyInstance().format(mor));
    }
}
