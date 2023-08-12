package week03.day4;

import java.util.Arrays;

public class StockMain {

    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23, 4.35, 0.23, 4.0, 8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0, 2.0, 8.0, 4.0));
        System.out.println(stock2.maxProfit()); //6.0

        Stock stock3 = new Stock(Arrays.asList(4.0, 12.0, 2.0, 8.0, 4.0));
        System.out.println(stock3.maxProfit()); //8.0

        Stock stock4 = new Stock(Arrays.asList(34.0, 12.0, 2.0, 1.0, 1.0));
        System.out.println(stock4.maxProfit()); //0.0
    }
}
