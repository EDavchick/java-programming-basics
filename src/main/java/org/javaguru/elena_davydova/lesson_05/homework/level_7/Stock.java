package org.javaguru.elena_davydova.lesson_05.homework.level_7;

import java.util.Scanner;

public class Stock {

    Scanner scanner = new Scanner(System.in);
    String name = nameStock();

    private String nameStock(){
        System.out.print("Enter a name of stock: ");
        return scanner.nextLine();
    }

    public int countStock(){
        System.out.print("Enter a number of stock quotes: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public double[] listPrices(int stockPriceCount) {
        double[] prices = new double[stockPriceCount];

        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Enter a price of stock " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }

    public double maxPriceStock(double[] prices) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Maximum price of stock " + this.name + ": " + maxPrice);
        return maxPrice;
    }

    public double minPriceStock(double[] prices) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        System.out.println("Minimum price of stock " + this.name + ": " + minPrice);
        return minPrice;
    }

    public double averagePriceStock(double[] prices) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        double averagePrice = totalPrice / prices.length;
        System.out.println("Average price of stock " + this.name + ": " + averagePrice);
        return averagePrice;
    }




}
