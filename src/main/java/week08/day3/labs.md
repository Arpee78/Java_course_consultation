Az alábbi feladatban egy koncertre való beléptetést fogunk megvalósítani. Készíts egy  `day03.Ticket` osztályt. Minden jegyen rajta van, a zenekar neve, a pontos dátum és időpont, és az ár.
Ezeket konstruktorban állítsuk be. Legyen továbbá egy `entryTime()` metódus, ami megmondja, hogy mikor léphetünk be a rendezvényre (csak az időpontot, dátumot már nem). Ez itt legyen egy órával a kezdés előtt. <br>

Legyen egy `day03.FrontOfStageTicket` osztályunk, ami a legjobb helyekre szól és a `Ticket` leszármazottja. Ennek ára 30%-al több mint a sima jegynek. Ennek az osztálynak további attribútuma egy extra kód, amivel később olcsóbban tudunk vásárolni. Ezeket mind konstruktorban állítsuk be. Ilyen típusú jeggyel a koncertkezdés előtt 2 órával tudunk bemenni.<br>

Legyen egy `Person` osztályunk, akinek csupán egy jegy attribútuma van és ezt konstruktorban állítjuk be.<br>

Illetve legyen még egy `Concert` osztály, ami már a rendezvényt reprezentálja és van egy emberek listája. Legyen egy `addPerson()` nevű metódusa, ami egy embert és egy pontos időpontot vár paraméterül és ellenőrzi, hogy az ember be mehet-e a koncertre a kapott időpontban. Ha igen hozzáadjuk a listához, ha nem `IllegalArgumentException`-t dobunk.
(commit: ex-w08d03)