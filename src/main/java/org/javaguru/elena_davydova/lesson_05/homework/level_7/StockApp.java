package org.javaguru.elena_davydova.lesson_05.homework.level_7;

public class StockApp {
    public static void main(String[] args) {
        StockService stockService = new StockService();

        int countStock = stockService.stock.countStock();
        double[] prices = stockService.stock.listPrices(countStock);
        stockService.maxPriceStock(prices);
        stockService.minPriceStock(prices);
        stockService.averagePriceStock(prices);

        System.out.println("Program is finished.");
    }
}
