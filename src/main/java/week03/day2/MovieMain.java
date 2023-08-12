package week03.day2;

public class MovieMain {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Leonardo DiCaprio", 1974);
        Actor actor2 = new Actor("Kate Winslet", 1975);
        Actor actor3 = new Actor("Billy Zane", 1966);

        Movie movie = new Movie("Titanic", 1997);

        movie.addActor(actor1);
        movie.addActor(actor2);
        movie.addActor(actor3);

        movie.getActors().get(0).setName("Leo");
        for (Actor actual : movie.getActors()) {
            System.out.println(actual.getName());
        }
    }
}
