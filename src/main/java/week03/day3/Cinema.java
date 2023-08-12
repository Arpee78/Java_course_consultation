package week03.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> moviesInTime = new ArrayList<>();

        for (Movie actualMovie : movies) {
            for (LocalDateTime actualTime : actualMovie.getTimes()) {
                LocalDateTime plus30Minutes=actualTime.plus(Duration.ofMinutes(30));
                if (time.isEqual(actualTime) || (time.isAfter(actualTime) && time.isBefore(plus30Minutes))) {
                    moviesInTime.add(actualMovie.getTitle());
                }
            }
        }
        return moviesInTime;
    }


}
