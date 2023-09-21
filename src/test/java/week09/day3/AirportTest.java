package week09.day3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

    Airport airport = new Airport();

    @BeforeEach
    void testSetUp() {
        airport.LoadFlights(Path.of("src/test/resources/planes.txt"));
    }

    @Test
    void testLoadFlights() {
        assertEquals(100, airport.getFlights().size());
        assertEquals("ID4963", airport.getFlights().get(2).getFlightNumber());
        assertEquals("Stockholm", airport.getFlights().get(98).getCity());
    }

    @Test
    void testDirection() {
        assertEquals("Az induló járatokból van több", airport.direction());
    }

    @Test
    void testGetMyFlights() {
        assertEquals(4, airport.getMyFlights("Paris", Direction.ARRIVAL).size());
    }

    @Test
    void testIsScheduleRight() {
        assertFalse(airport.isScheduleRight());
//        assertTrue(airport.isScheduleRight());
    }

    @Test
    void testDeleteNightFlights() {
        airport.deleteNightFlights();
        assertEquals(100,airport.getFlights().size());
    }
}