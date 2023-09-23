package week09.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharactersTest {

    Characters characters = new Characters();

    @Test
    void testFindMostCommonCharacter(){
        assertEquals('a',characters.findMostCommonChar("almafa"));
        assertEquals('e',characters.findMostCommonChar("Ejj de derék ember ez!"));
        assertEquals('z',characters.findMostCommonChar("Ejj dz dzrék zmbzr zz!"));
    }

    @Test
    void testFindMostCommonCharacterWithEmptyString(){
        assertThrows(IllegalArgumentException.class,()-> characters.findMostCommonChar("  "), "String cannot be empty or contain only white spaces!");
    }

}