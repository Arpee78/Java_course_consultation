package week09.day3;

import java.time.LocalTime;

public class Flight {

    private String flightNumber;
    private Direction direction;
    private String City;
    private LocalTime time;

    public Flight(String flightNumber, Direction direction, String city, LocalTime time) {
        this.flightNumber = flightNumber;
        this.direction = direction;
        City = city;
        this.time = time;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Direction getDirection() {
        return direction;
    }

    public String getCity() {
        return City;
    }

    public LocalTime getTime() {
        return time;
    }
}
