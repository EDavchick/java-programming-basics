package org.javaguru.elena_davydova.lesson_05.homework.level_7;

public class StockApp {
    public static void main(String[] args) {
        StockService stockService = new StockService();

        int countStock = stockService.stock.countStock();
        double[] prices = stockService.stock.listPrices(countStock);
        double maxPrice = stockService.maxPriceStock(prices);
        double minPrice = stockService.minPriceStock(prices);
        double averagePrice = stockService.averagePriceStock(prices);

        System.out.println("Program is finished.");
    }
}
