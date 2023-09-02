package week06.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CourierFileManager {

    private Courier courier = new Courier();

    public Courier createCourierByFile(Path path) {
        readFile(path);
        return courier;
    }

    private void readFile(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            processLines(lines);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file: " + path, ioe);
        }
    }

    private void processLines(List<String> lines) {
        for (String s : lines) {
            String[] parts = s.split(" ");
            int day = Integer.parseInt(parts[0]);
            int count = Integer.parseInt(parts[1]);
            int distance = Integer.parseInt(parts[2]);
            Ride ride = new Ride(day, count, distance);
            courier.addRide(ride);
        }
    }
}
