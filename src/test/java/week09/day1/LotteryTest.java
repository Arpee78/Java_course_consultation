package week09.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void startLottery() {
        Lottery lottery = new Lottery(6,6);
        assertEquals(6,lottery.startLottery().size());
        assertTrue(lottery.startLottery().contains(1));
        assertTrue(lottery.startLottery().contains(2));
        assertTrue(lottery.startLottery().contains(3));
        assertTrue(lottery.startLottery().contains(4));
        assertTrue(lottery.startLottery().contains(5));
        assertTrue(lottery.startLottery().contains(6));
    }
}