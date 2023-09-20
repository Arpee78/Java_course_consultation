package week09.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void startLottery() {
        Lottery lottery = new Lottery(100,6);
        assertEquals(6,lottery.startLottery().size());
    }
}