package org.javaguru.elena_davydova.lesson_04.tasks;

public class StoreSale {
    public static void main(String[] args) {
        double purchasesSum1 = 5500;
        double purchasesSum2 = 10000;

        System.out.println(discountSum(purchasesSum1));
        System.out.println(discountSum(purchasesSum2));
    }

    static double discountSum(double purchasesSum){
        double discountSum = 0;

        if (purchasesSum > 5000 && purchasesSum < 10000) {
            discountSum = purchasesSum * 0.9;
        } else if (purchasesSum > 9999.9) {
            discountSum = purchasesSum * 0.8;
        }
        return discountSum;
    }
}
