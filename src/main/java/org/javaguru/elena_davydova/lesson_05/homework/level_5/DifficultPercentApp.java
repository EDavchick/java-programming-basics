package org.javaguru.elena_davydova.lesson_05.homework.level_5;

public class DifficultPercentApp {
    public static void main(String[] args) {
        DifficultPercent df = new DifficultPercent();

        System.out.println(
                "Principal = 1000.0, " +
                "interestRatePerYear = 0.02, " +
                "numberOfYearsInvested = 10 = "
                + df.findDifficultPercent(1000, 0.2, 1, 10));

        System.out.println(
                "Principal = 5000.0, " +
                "interestRatePerYear = 0.05, " +
                "numberOfYearsInvested = 10 = "
                + df.findDifficultPercent(5000, 0.1, 2, 10));
    }
}
