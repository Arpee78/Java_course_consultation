package week04.day1.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    PerfectNumbers perfectNumbers = new PerfectNumbers();

    @Test
    void isPerfectNumberTrue() {
        assertTrue(perfectNumbers.isPerfectNumber(6));
        assertTrue(perfectNumbers.isPerfectNumber(8128));
        assertTrue(perfectNumbers.isPerfectNumber(33_550_336));
    }

    @Test
    void isPerfectNumberFalse() {
        assertFalse(perfectNumbers.isPerfectNumber(5));
        assertFalse(perfectNumbers.isPerfectNumber(8127));
        assertFalse(perfectNumbers.isPerfectNumber(33_550_337));
    }
}