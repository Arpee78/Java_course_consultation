package week08.day3;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class FrontOfStageTicketTest {

    FrontOfStageTicket frontOfStageTicket = new FrontOfStageTicket("Beatles", LocalDateTime.of(2023, 11, 22, 20, 00), 1000, "DRT1547");
    LocalTime entryTime = frontOfStageTicket.entryTime();

    @Test
    void getPrice() {
        int price = frontOfStageTicket.getPrice();
        assertEquals(1300, price);

    }

    @Test
    void entryTime() {
        LocalTime expected = LocalTime.of(18, 00);
        assertEquals(expected, entryTime);
    }
}