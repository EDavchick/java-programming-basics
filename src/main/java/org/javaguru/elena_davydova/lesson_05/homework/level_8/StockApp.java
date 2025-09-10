package org.javaguru.elena_davydova.lesson_05.homework.level_8;

import java.util.Scanner;

public class StockApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter stock name: ");
        String stockName = scanner.nextLine();

        System.out.print("Enter number of stock quotes: ");
        int stockPriceCount = Integer.parseInt(scanner.nextLine());

        double[] prices = new double[stockPriceCount];
        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Enter price " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }

        Stock stock = new Stock(stockName, prices);
        System.out.println(stock);

        StockService service = new StockService();
        service.maxPriceStock(stock);
        service.minPriceStock(stock);
        service.averagePriceStock(stock);

        System.out.println("Program is finished.");
    }
}