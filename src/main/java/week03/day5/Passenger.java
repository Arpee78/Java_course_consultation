package week03.day5;

public class Passenger {

    private String name;
    private String ticketId;
    private int numberOfLuggage;

    public Passenger(String name, String ticketId, int numberOfLuggage) {
        this.name = name;
        this.ticketId = ticketId;
        this.numberOfLuggage = numberOfLuggage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getNumberOfLuggage() {
        return numberOfLuggage;
    }

    public void setNumberOfLuggage(int numberOfLuggage) {
        this.numberOfLuggage = numberOfLuggage;
    }
}
