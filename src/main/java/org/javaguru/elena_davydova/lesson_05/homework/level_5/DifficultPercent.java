package org.javaguru.elena_davydova.lesson_05.homework.level_5;

/*
A = P × (1 + r/n) ^ (n × t)
A — итоговая сумма (тело депозита + проценты),
P — первоначальная сумма (тело депозита), - depositBody
r — годовая процентная ставка (в десятичном виде), например, 10% станет 0,10. - annualPercentageRate
n — количество начислений процентов в год, - interestPercent
t — срок вклада в годах. - depositYears
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
