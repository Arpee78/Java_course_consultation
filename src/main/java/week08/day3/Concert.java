package week08.day3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> people = new ArrayList<>();

    public List<Person> getPeople() {
        return new ArrayList<>(people);
    }

    public void addPerson(Person person, LocalTime localTime) {
        LocalTime entryTime = person.getTicket().entryTime();
        if (!localTime.isAfter(entryTime)) {
            throw new IllegalArgumentException("Cannot add this person before entrytime: " + entryTime.toString());
        }
        people.add(person);
    }

}
