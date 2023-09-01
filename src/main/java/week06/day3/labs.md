Adott egy fájl, melyben egy elsős diák tanévkezdésre beszerzendő tanszereinek
leírása található. A fájl tartalma:


```java
3;négyzetrácsos füzet;kis alakú
2;vonalas füzet;elsős(14-32), kis alakú
1;radír;jó minőségű
1;hegyező;tartályos
50;rajzlap;félfamentes
10;rajzlap;műszaki
2;mappa;A4-es méretű, gumis
```

Hozd létre az adatokból a `schoolequipment.csv` állományt az `src/main/resources`
könyvtárban! Hozz létre egy `SchoolEquipment` osztályt, ami a fájl egy sorát
reprezentálja! Majd készítsd el a `FirstA` osztályt, ami tárol egy listát az
első osztályban szükséges tanszerekről, és konstruktorban beolvassa a paraméterül
(`Path`) átadott fájl tartalmát! Készíts unit teszteket is! (commit: ex-w06d03)