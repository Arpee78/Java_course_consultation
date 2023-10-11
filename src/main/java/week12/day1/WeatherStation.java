package week12.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private List<Rain> rainObservation = new ArrayList<>();

    public void readRainFile(Path path) {
        try {
            processLines(Files.readAllLines(path));
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

    private void processLines(List<String> lines) {
        for (String s : lines) {
            String[] parts = s.split(";");
            int quantity = Integer.parseInt(parts[0]);
            LocalDate date = LocalDate.parse(parts[1]);
            rainObservation.add(new Rain(quantity, date));
        }
    }

    public int getRainInMonth(int year, int month) {
        int sum = 0;
        for (Rain r : rainObservation) {
            if (r.getDate().getYear() == year && r.getDate().getMonthValue() == month) {
                sum += r.getQuantity();
            }
        }
        return sum;
    }


}
