package week04.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {

    NameValidator nameValidator = new NameValidator();
    boolean result;

    @Test
    void isValidNameTrue() {
        result = nameValidator.isValidName("  John     Smith ");
        assertTrue(result);
    }

    @Test
    void isValidNameFalseLowerCase() {
        result = nameValidator.isValidName("john Smith");
        assertFalse(result);
    }

    @Test
    void isValidNameFalseLessThanTwoWords() {
        result = nameValidator.isValidName("John");
        assertFalse(result);
    }
}