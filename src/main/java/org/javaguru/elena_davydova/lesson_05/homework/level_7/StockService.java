package org.javaguru.elena_davydova.lesson_05.homework.level_7;

public class StockService {

    Stock stock = new Stock();

    public double maxPriceStock(double[] prices) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Maximum price of stock " + stock.name + ": " + maxPrice);
        return maxPrice;
    }

    public double minPriceStock(double[] prices) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        System.out.println("Minimum price of stock " + stock.name + ": " + minPrice);
        return minPrice;
    }

    public double averagePriceStock(double[] prices) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        double averagePrice = totalPrice / prices.length;
        System.out.println("Average price of stock " + stock.name + ": " + averagePrice);
        return averagePrice;
    }
}
