package org.javaguru.mentor.lesson_5_methods.homework.solutions.level_3.task_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculator {
    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal tax;
        BigDecimal rate30 = new BigDecimal("0.30");
        BigDecimal rate40 = new BigDecimal("0.40");
        BigDecimal rate50 = new BigDecimal("0.50");

        BigDecimal firstBracket = new BigDecimal("10000");
        BigDecimal secondBracket = new BigDecimal("50000");

        if (income.compareTo(firstBracket) <= 0) {
            tax = income.multiply(rate30)
                    .setScale(2, RoundingMode.HALF_UP);
        }

        else if (income.compareTo(firstBracket) > 0
                && income.compareTo(secondBracket) <= 0) {
            BigDecimal tax10k = firstBracket.multiply(rate30);
            BigDecimal tax10kPlus = income.subtract(firstBracket)
                    .multiply(rate40);
            tax = tax10k.add(tax10kPlus).setScale(2, RoundingMode.HALF_UP);
        }

        else {
            BigDecimal tax10k = firstBracket.multiply(rate30);
            BigDecimal tax50k = new BigDecimal("40000").multiply(rate40);
            BigDecimal tax50kPlus = income.subtract(secondBracket)
                    .multiply(rate50);
            tax = tax10k.add(tax50k).add(tax50kPlus).setScale(2, RoundingMode.HALF_UP);
        }
            return tax;
        }

    }
