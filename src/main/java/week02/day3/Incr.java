package week02.day3;

import java.util.Arrays;
import java.util.List;

public class Incr {

    public boolean isListIncreasing(List<Integer> numbers) {
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) >= numbers.get(i)) {
                return false;
            }
        }
        return true;
    }

    public int numberOfIncSeries(List<Integer> numbers) {

        int count = 0;
        boolean inc = false;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) <= numbers.get(i)) {
                inc = true;
            } else {
                if (inc) {
                    inc = false;
                    count++;
                }
            }
        }
        count = inc ? count + 1 : count;
        return count;
    }


    public static void main(String[] args) {
        System.out.println(new Incr().isListIncreasing(Arrays.asList(1,2,8,12)));
        System.out.println(new Incr().numberOfIncSeries(Arrays.asList(2, 1,3,1,2,3,1)));
    }
}
