package week07.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    public void updateList(List<Integer> numbersToAdd) {
        numbers.addAll(numbersToAdd);
    }

    public void updateList(int count, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(min, max + 1));
        }
    }

    public List<Integer> closeToAverage(int value) {
        List<Integer> result = new ArrayList<>();
        double average = getAverage();
        for (int i : numbers) {
            if (Math.abs(average - i) <= value) {
                result.add(i);
            }
        }
        return result;
    }

    private double getAverage() {
        double sum = 0;
        for (Integer i : numbers) {
            sum += i;
        }
        return sum / numbers.size();
    }
}
