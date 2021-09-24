package com.company;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat();
        float monthlyInterest = interest / 100 / 12;

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();
        int months = years * 12;

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double mortgage = principal *
                ((monthlyInterest * Math.pow((1 + monthlyInterest), months)) / (Math.pow(1 + monthlyInterest, months) - 1));

        String mortgageCurrency = currency.format(mortgage);
        System.out.println("Mortgage:" + mortgageCurrency);

    }
}
