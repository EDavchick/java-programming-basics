package org.javaguru.elena_davydova.lesson_05.homework.level_3;
//        double tax10K = amount * 0.3;
//        double tax50K = (amount - tax10K) * 0.4;
//        double tax50Plus = (amount - (tax10K + tax50K)) * 0.5;

public class TaxCalculator {
    double taxAmount(int amount) {
        double tax = 0.0;

        double rate30 = 0.3;
        double rate40 = 0.4;
        double rate50 = 0.5;

        double tax10K = 10000 * rate30;
        double tax50K = 40000 * rate40;

        if (amount <= 10000)
            tax = amount * rate30;
        else if (amount <= 50000)
            tax = ((amount - 10000) * rate40) + tax10K;
        else
            tax = ((amount - 50000) * rate50) + (tax10K + tax50K);
        return tax;
    }
}
