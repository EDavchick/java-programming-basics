package org.javaguru.elena_davydova.lesson_05.homework.level_3;

public class TaxCalculatorApp {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();

        System.out.println("Income 10000, tax = " + taxCalculator.taxAmount(10000));
        System.out.println("Income 10001, tax = " + taxCalculator.taxAmount(10001));
        System.out.println("Income 50000, tax = " + taxCalculator.taxAmount(50000));
        System.out.println("Income 55000, tax = " + taxCalculator.taxAmount(55000));
        System.out.println("Income 9999, tax = " + taxCalculator.taxAmount(9999));
    }

    /*
    Income 10000, tax = 3000.00
    Income 10001, tax = 3000.40
    Income 50000, tax = 19000.00
    Income 55000, tax = 21500.00
    Income 9999, tax = 2999.70
     */
}
