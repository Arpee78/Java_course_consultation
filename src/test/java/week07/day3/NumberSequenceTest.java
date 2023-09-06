package week07.day3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    NumberSequence numberSequence = new NumberSequence();


    @Test
    void testUpdateList() {
        numberSequence.updateList(List.of(3, 5, 6, 7, 12));
        List<Integer> expected = numberSequence.getNumbers();
        assertEquals(5, expected.size());
        assertEquals(3, expected.get(0));
        assertEquals(7, expected.get(3));
    }

    @Test
    void testUpdateListGenerated() {
        numberSequence.updateList(3, 1, 100);
        List<Integer> expected = numberSequence.getNumbers();
        assertEquals(3, expected.size());
    }

    @Test
    void testCloseToAverage() {
        numberSequence.updateList(List.of(3, 5, 6, 7, 12));
        List<Integer> expected = numberSequence.closeToAverage(2);
        assertEquals(3, expected.size());
        assertEquals(5, expected.get(0));
        assertEquals(7, expected.get(2));
    }
}