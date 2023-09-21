package week09.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public List<Flight> getFlights() {
        return flights;
    }

    public void LoadFlights(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            processLines(lines);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file: "+ e);
        }
    }

    private void processLines(List<String> lines) {
        for (String s : lines) {
            String[] parts = s.split(" ");
            String flightNumber = parts[0];
            Direction direction = Direction.valueOf(parts[1].toUpperCase());
            String city = parts[2];
            LocalTime time = LocalTime.parse(parts[3]);
            flights.add(new Flight(flightNumber, direction, city, time));
        }
    }

    public String direction() {
        int arrivals = 0;
        int departures = 0;

        for (Flight f : flights) {
            if (f.getDirection() == Direction.ARRIVAL) {
                arrivals++;
            }
            if (f.getDirection() == Direction.DEPARTURE) {
                departures++;
            }
        }

        if (arrivals > departures) {
            return "Az érkező járatokból van több";
        }

        if (departures > arrivals) {
            return "Az induló járatokból van több";
        }
        return "Az érkező és induló járatok száma egyenlő";
    }

    public List<Flight> getMyFlights(String city, Direction direction) {
        List<Flight> result = new ArrayList<>();
        for (Flight f : flights) {
            if (f.getCity().equals(city) && f.getDirection() == direction) {
                result.add(f);
            }
        }
        return result;
    }

    public boolean isScheduleRight() {

        for (int i = 0; i < flights.size() - 1; i++) {
            for (int j = i + 1; j < flights.size(); j++) {
                Flight f1 = flights.get(i);
                Flight f2 = flights.get(j);
                int time1 = getMinutes(f1.getTime());
                int time2 = getMinutes(f2.getTime());
                boolean sameDirection = f1.getDirection() == f2.getDirection();
                if (sameDirection && Math.abs(time1 - time2) < 3) {
                    return false;
                }
            }
        }
        return true;

    }

    private int getMinutes(LocalTime time) {
        return time.getHour() * 60 + time.getMinute();
    }

    public void deleteNightFlights() {
        List<Flight> flightsToDelete = new ArrayList<>();

        for (Flight f : flights) {
            LocalTime startOfNight = LocalTime.of(0, 0);
            LocalTime endofNight = LocalTime.of(5, 0);
            if (f.getTime().isAfter(startOfNight) && f.getTime().isBefore(endofNight)) {
                flightsToDelete.add(f);
            }
        }
        flights.removeAll(flightsToDelete);
    }
}
