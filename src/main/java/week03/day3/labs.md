
Készíts egy `w03d03.Movie` nevű osztályt, melyben szerepel a film címe, illetve időpontok listája amikor játszák a moziban (`LocalDateTime`). Mind a két attribútumot konstruktorban állítsuk be! 

Készítsd el a `w03d03.Cinema` nevű osztályt, melyben filmek listája szerepel. Legyen egy `addMovie(Movie movie)` metódus, amivel filmet lehet hozzáadni a listához. 

Készíts egy `findMovieByTime(LocalDateTime time)` nevű metódust, ami listában visszaadja azon filmek címét, amiket a paraméterül kapott időpontban játszanak. (commit: ex-w03d03)
A feladathoz tartozó main metódus: 

```java
  public static void main(String[] args) {
        Cinema cinema = new Cinema();

        cinema.addMovie(new Movie("Titanic", Arrays.asList(
                LocalDateTime.of(2022,8,10,12,45),
                LocalDateTime.of(2022,8,10,22,25)
                )));
        cinema.addMovie(new Movie("Jurassic Park", Arrays.asList(
                LocalDateTime.of(2022,8,10,19,45),
                LocalDateTime.of(2022,8,10,20,25),
                LocalDateTime.of(2022,8,10,22,25)
        )));

        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2022,8,10,10,45))); // []
        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2022,8,10,19,45))); // [Jurassic Park]
        System.out.println(cinema.findMovieByTime(LocalDateTime.of(2022,8,10,22,25))); // [Titanic, Jurassic Park]

    }
```
Bónusz (nem kötelező) feladat úgy átírni a programot, hogy azokat a filmeket adja vissza, amiket a kapott időponthoz képest fél órán belül játszanak. 

