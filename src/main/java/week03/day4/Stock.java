package week03.day4;

import java.util.List;

public class Stock {

    private List<Double> values;

    public Stock(List<Double> values) {
        this.values = values;
    }

    public double maxProfit() {
        double maxProfit = 0;
        for (int day = 0; day < values.size(); day++) {
            maxProfit = getDailyMaxProfit(day, maxProfit);
        }
        return maxProfit;
    }

    private double getDailyMaxProfit(int day, double maxProfit) {
        for (int j = day + 1; j < values.size(); j++) {
            double actual = values.get(j) - values.get(day);
            if (maxProfit < actual) {
                maxProfit = actual;
            }
        }
        return maxProfit;
    }
}
