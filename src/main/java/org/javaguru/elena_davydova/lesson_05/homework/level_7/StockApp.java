package org.javaguru.elena_davydova.lesson_05.homework.level_7;

import java.util.Scanner;

public class StockApp {
    public static void main(String[] args) {
        Stock stock = new Stock();

        int countStock = stock.countStock();
        double[] prices = stock.listPrices(countStock);
        double maxPrice = stock.maxPriceStock(prices);
        double minPrice = stock.minPriceStock(prices);
        double averagePrice = stock.averagePriceStock(prices);

        System.out.println("Program is finished.");
    }
}
