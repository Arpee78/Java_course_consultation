Adott egy fájl melyben egy reptér egy napi repülőjáratait rögzítettük. Adott egy járatszám, az, hogy érkező vagy felszálló gépről van-e szó. A kiinduló/cél város, attól függően hogy indul vagy érkezik-e a gép és a felszállás/leszállás pontos ideje. 
A file:
```
FC5354 Arrival Dublin 18:16
KH2442 Departure Berlin 15:54
ID4963 Departure Amsterdam 15:22
CX8486 Arrival Brussels 10:37
EJ9251 Departure  Toronto 11:30
KJ7245 Departure Bern 06:18
JN6048 Arrival Moscow 18:39
MN5047 Arrival Athens 09:35
```
[Teljes file](https://github.com/Strukturavaltas3-Alap-Java/java-strukturavalto3-alap/blob/main/consultations/src/main/resources/week09day03/planes.txt)

Feladatok:
1. Olvasd be a fájl tartalmát a memóriába.
2. Határozd meg, hogy induló vagy érkező járatból volt-e több.
3. Írj egy metódust ami bekér egy várost és azt, hogy az induló vagy érkező járatokat szeretnénk-e. És egy Listába adjuk viassza az összes abba városba/ból induló/érkező repülőt.
4. A repülőtéren két kifutó van az egyiken az érkező gépek landolnak a másikon az indulók szálnak fel. Két esemény között legalább 3 percnek el kell telnie.(Két leszállás avgy két felszállás között) Készíts egy metódust ami eldönti, hogy ennek megfelelő-e a mentrend.
5. A repülőtér 00:00 és 5:00 között zárva tart, írj egy metódust, ami az ebbe az idősávba eső gépeket törli a listából.