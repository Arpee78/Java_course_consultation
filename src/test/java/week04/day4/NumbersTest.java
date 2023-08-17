package week04.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    Numbers numbers = new Numbers();
    int result;
    int max = Integer.MAX_VALUE;
    int expected = 46;

    @Test
    void testSumOfDigits1() {
        result = numbers.sumOfDigits1(max);
        assertEquals(expected, result);
    }

    @Test
    void testSumOfDigits2() {
        result = numbers.sumOfDigits2(max);
        assertEquals(expected, result);
    }

    @Test
    void testSumOfDigits3() {
        result = numbers.sumOfDigits3(max);
        assertEquals(expected, result);
    }

    @Test
    void testSumOfDigits4() {
        result = numbers.sumOfDigits4(max);
        assertEquals(expected, result);
    }

    @Test
    void testSumOfDigits5() {
        result = numbers.sumOfDigits5(max);
        assertEquals(expected, result);
    }

}