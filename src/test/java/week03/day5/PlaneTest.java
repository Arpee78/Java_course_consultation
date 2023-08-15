package week03.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void createPlane() {
        Plane plane = new Plane(180);

        assertEquals(180, plane.getMaxCapacity());
    }

    @Test
    void testAddPassengerCanSit(){
        Plane plane = new Plane(180);
        boolean result = plane.addPassenger(new Passenger("John Doe", "RDT675", 2));
        assertTrue(result);
        assertEquals(1, plane.getPassengers().size());
        assertEquals("RDT675", plane.getPassengers().get(0).getTicketId());
    }

    @Test
    void testAddPassengerCannotSit(){
        Plane plane = new Plane(3);
        plane.addPassenger(new Passenger("John Doe", "RDT675", 1));
        plane.addPassenger(new Passenger("Jack Doe", "RDT676", 2));
        plane.addPassenger(new Passenger("Joe Doe", "RDT677", 3));
        boolean result = plane.addPassenger(new Passenger("Jane Doe", "RDT678", 4));
        assertFalse(result);
    }

    @Test
    void testGetNumberOfPackages() {
        Plane plane = new Plane(3);
        assertEquals(0, plane.getNumberOfPackages());
        plane.addPassenger(new Passenger("John Doe", "RDT675", 1));
        plane.addPassenger(new Passenger("Jack Doe", "RDT676", 0));
        plane.addPassenger(new Passenger("Joe Doe", "RDT677", 3));
        assertEquals(4, plane.getNumberOfPackages());
    }

}

