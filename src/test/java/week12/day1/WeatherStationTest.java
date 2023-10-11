package week12.day1;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WeatherStationTest {

    @Test
    void getRainByMonth() {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.readRainFile(Path.of("src/test/resources/rain.csv"));
        assertEquals(34, weatherStation.getRainInMonth(2022, 1));
        assertEquals(0, weatherStation.getRainInMonth(2022, 10));

    }
}