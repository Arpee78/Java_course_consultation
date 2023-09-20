package week09.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int drawableLimit;
    private int drawnCount;

    public Lottery(int drawableLimit, int drawnCount) {
        this.drawableLimit = drawableLimit;
        this.drawnCount = drawnCount;
    }

    public int getDrawableLimit() {
        return drawableLimit;
    }

    public int getDrawnCount() {
        return drawnCount;
    }

    public List<Integer> startLottery() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        while (numbers.size() < drawnCount) {
            int number = random.nextInt(drawableLimit) + 1;
            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }
        return numbers;
    }
}
