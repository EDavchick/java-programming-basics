package org.javaguru.elena_davydova.lesson_05.homework.level_8;

import java.util.Arrays;

public class Stock {
    private String name;
    private double[] prices;

    public Stock(String name, double[] prices) {
        this.name = name;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public double[] getPrices() {
        return prices;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", prices=" + Arrays.toString(prices) +
                '}';
    }
}
