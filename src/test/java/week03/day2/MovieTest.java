package week03.day2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    Actor actor1;
    Actor actor2;
    Actor actor3;
    Movie movie;

    @BeforeEach
    void setUp() {
        actor1 = new Actor("Leonardo DiCaprio", 1974);
        actor2 = new Actor("Kate Winslet", 1975);
        actor3 = new Actor("Billy Zane", 1966);
        movie = new Movie("Titanic", 1997);
    }

    @Test
    void testAddActor() {
        movie.addActor(actor1);
        movie.addActor(actor2);
        movie.addActor(actor3);
        int count = movie.getActors().size();
        assertEquals(3,count);
    }

    @Test
    void testActorsInTheirTwenties() {
        movie.addActor(actor1);
        movie.addActor(actor2);
        movie.addActor(actor3);
        int count = movie.actorsInTheirTwenties();
        assertEquals(2,count);

    }
}