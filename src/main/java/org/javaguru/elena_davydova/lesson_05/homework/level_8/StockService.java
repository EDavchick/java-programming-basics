package org.javaguru.elena_davydova.lesson_05.homework.level_8;

public class StockService {
    public double maxPriceStock(Stock stock) {
        double maxPrice = stock.getPrices()[0];
        for (double price : stock.getPrices()) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Maximum price of stock " + stock.getName() + ": " + maxPrice);
        return maxPrice;
    }

    public double minPriceStock(Stock stock) {
        double minPrice = stock.getPrices()[0];
        for (double price : stock.getPrices()) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        System.out.println("Minimum price of stock " + stock.getName() + ": " + minPrice);
        return minPrice;
    }

    public double averagePriceStock(Stock stock) {
        double totalPrice = 0.0;
        for (double price : stock.getPrices()) {
            totalPrice = totalPrice + price;
        }
        double averagePrice = totalPrice / stock.getPrices().length;
        System.out.println("Average price of stock " + stock.getName() + ": " + averagePrice);
        return averagePrice;
    }
}
