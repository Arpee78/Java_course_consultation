package week08.day3;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    @Test
    void testAddValidPerson() {
        Concert concert = new Concert();
        Ticket ticket = new Ticket("RHCP", LocalDateTime.of(2023,11,11,21,0),25_000);
        concert.addPerson(new Person(ticket), LocalTime.of(20,1));
        assertEquals(1, concert.getPeople().size());
    }

    @Test
    void testAddInValidPerson() {
        Concert concert = new Concert();
        FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("RHCP", LocalDateTime.of(2023,11,11,21,0),25_000, "TRE-2025");
        Person person = new Person(frontOfStageTicket);
        assertThrows(IllegalArgumentException.class, ()->concert.addPerson(person, LocalTime.of(18,59)));
    }
}