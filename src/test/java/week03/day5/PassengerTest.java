package week03.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void createPassenger(){
        Passenger passenger = new Passenger("John Doe", "GRT456", 2);

        assertEquals("John Doe", passenger.getName());
        assertEquals("GRT456", passenger.getTicketId());
        assertEquals(2, passenger.getNumberOfLuggage());
    }

}