Adott az alábbi mintafájl (`rain.csv`), amely soronként azt tartalmazza, hogy egy adott napon hány
milliméter eső esett. Készíts egy metódust, amely paraméterül egy évet és egy hónapot kap, és
visszaadja, mennyi eső esett összesen abban a hónapban!

```text
10;2021-11-10
8;2021-11-14
32;2021-11-29
20;2022-01-03
14;2022-01-25
6;2022-02-12
15;2022-05-21
2;2022-05-30
```

(A fenti szöveges formátumban megadott dátumokból `LocalDate` objektum a `LocalDate.parse()` metódussal
készíthető. Commit: `ex-w12d01`)