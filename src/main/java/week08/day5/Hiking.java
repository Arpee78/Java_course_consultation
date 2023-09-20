package week08.day5;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> heights) {
        double fullElevation = 0;

        for (int i = 1; i < heights.size(); i++) {
            double elevation = heights.get(i) - heights.get(i-1);
            if (elevation > 0) {
                fullElevation += elevation;
            }
        }
        return fullElevation;
    }
}
