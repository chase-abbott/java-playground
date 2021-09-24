package com.company;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = Integer.parseInt(scanner.next());
        System.out.print("Annual Interest Rate: ");
        float interest = Float.parseFloat(scanner.next());
        System.out.print("Period (Years): ");
        int years = Integer.parseInt(scanner.next());
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double mortgage = principal * ((((interest / 1000 / 12) * Math.pow((1 + (interest / 1000 / 12)), (years * 12))) / (Math.pow(1 + (interest / 1000 / 12), (years * 12)) - 1))) ;
        String mortgageCurrency = currency.format(mortgage);
        System.out.println("Mortgage:" + mortgageCurrency);

    }
}
