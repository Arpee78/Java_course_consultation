package week12.day4;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LandServiceTest {

    @Test
    void testGetStreetToCorrect() {
        LandService landService = new LandService();
        landService.readFile(Path.of("src/test/resources/utca.txt"));
        List<String> streets = landService.getStreetToCorrect();
        assertEquals(1, streets.size());
        assertEquals("Kurta", streets.get(0));
    }

    @Test
    void testWriteTaxList() {
        LandService landService = new LandService();
        landService.readFile(Path.of("src/test/resources/utca.txt"));
        landService.writeTaxList(Path.of("src/test/resources/ado.txt"));

    }
}