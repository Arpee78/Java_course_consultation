package week08.day3;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void testEntryTime() {
        Ticket ticket = new Ticket("Beatles", LocalDateTime.of(2023,11,22,20,00),1000);
        LocalTime entryTime = ticket.entryTime();
        LocalTime expected = LocalTime.of(19,00);
        assertEquals(expected, entryTime);
    }
}