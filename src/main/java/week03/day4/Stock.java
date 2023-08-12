package week03.day4;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Double> values;

    public Stock(List<Double> values) {
        this.values = values;
    }

    public double maxProfit() {
        double maxProfit = 0; //Double.MIN_VALUE;
        for (int i = 0; i < values.size(); i++) {
            for (int j = i+1; j < values.size(); j++) {
                double actual = values.get(j) - values.get(i);
                if (maxProfit < actual) {
                    maxProfit = actual;
                }
            }
        }
        return maxProfit;
    }
}
