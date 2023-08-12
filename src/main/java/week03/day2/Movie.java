package week03.day2;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int yearOfRelease;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int count = 0;
        for (Actor actual : actors) {
            int age = yearOfRelease - actual.getYearOfBirth();
            if (age >= 20 && age < 30) {
                count++;
            }
        }
        return count;
    }

}
