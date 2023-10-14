Egy Balaton-parti önkormányzat építményadót vezet be. Az adó mértéke a telken lévő
építmény alapterületétől és a teleknek a Balatontól mért távolságától függ.  
A telkeket a Balatonparttól mért távolságtól függően három sávba sorolták be. Az A sávba
azok a telkek kerültek, amelyek 300 méternél közelebb vannak a tóhoz a B sáv az előzőn túl
600 méter távolságig terjed, a többi telek a C sávba tartozik. Az építmény után
négyzetméterenként fizetendő összeg sávonként eltérő, azonban, ha az így kiszámított összeg
nem éri el a 10.000 Ft-ot, akkor az adott építmény után nem kell adót fizetni.     

Az A sávban fizetendő összeg 800 Ft négyzetméterenként, a B sávban 600, míg a C sávban 100.   

Adott az `utca.txt` állomány melyben egy-egy telek adatai találhatók:
```
34093 Kossuth 25B C 120
10962 Kossuth 25C C 120
96094 Kossuth 26 C 181
48154 Kossuth 27 C 299
81752 Kossuth 29 C 79
63774 Kurta 1 A 255
96552 Kurta 2 B 48
80018 Kurta 3 A 184
12995 Malom 1 C 282
```
Az első oszlopban a tulajdonos adószáma, majd utcanév, házszám, adósáv és négyzetméter. Fontos egy adószámhoz több ház is tartozhat. (File: `consultations/src/main/resources/utca.txt`) 
Feladatok:
1. Olvasd be a memóriába a fájl tartalmát. 
2. Bár az utcák többé-kevésbé párhuzamosak a tó partjával, az egyes porták távolsága a parttól
az utcában nem feltétlenül ugyanannyi. Emiatt néhány utcában – az ottani tulajdonosok
felháborodására – egyes telkek eltérő sávba esnek. Listázza ki a képernyőre, hogy melyek
azok az utcák, ahol a telkek sávokba sorolását emiatt felül kell vizsgálni! Feltételezheti,
hogy minden utcában van legalább két telek és kihasználható, hogy az utcák szerint ABC sorrendben rendezett a fájl!
3. Határozza meg a fizetendő adót tulajdonosonként! A tulajdonos adószámát és a fizetendő
összeget írassa ki a mintának megfelelően a `fizetendo.txt` állományba! A fájlban
minden tulajdonos adatai új sorban szerepeljenek, a tulajdonos adószámát egy szóközzel
elválasztva kövesse az általa fizetendő adó teljes összege.