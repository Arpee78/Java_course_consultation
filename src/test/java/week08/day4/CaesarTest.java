package week08.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void encrypt() {
        Caesar caesar = new Caesar(27);
        String result1 = caesar.encrypt("a");
        assertEquals("b", result1);
    }
}