package org.javaguru.elena_davydova.lesson_05.homework.level_5;

/*
FV = PV * (1 + r/n)^(nt)*, где
FV — будущая сумма,
PV — начальная сумма - depositBody
r — годовая процентная ставка (в десятичном виде), например, 10% станет 0,10. - annualPercentageRate
n — количество периодов начисления в году - interestPercent
t — срок в годах - depositYears
 */
public class DifficultPercent {

    double findDifficultPercent(double depositBody,
                                double annualPercentageRate,
                                double interestPercent,
                                int depositYears) {
        return depositBody *
                Math.pow(
                        (1 + annualPercentageRate/interestPercent),
                        (interestPercent * depositYears));
    }
}
