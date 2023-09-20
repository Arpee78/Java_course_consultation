Készíts egy `day04.Encryption` nevű interface-t. Legyen egy `String encrypt(String input)` nevű metódusa, ami az inputot titkosítsja és visszatér a titkosított szöveggel.  

Történet:  Caesar-kód vagy Caesar-rejtjel az egyik legegyszerűbb és legelterjedtebb titkosírási módszer. Ez egy helyettesítő rejtjel, ami azt jelenti, hogy minden egyes betűt az ábécében egy tőle meghatározott távolságra lévő betűvel kell helyettesíteni. Így például, ha mondjuk az eltolódás 3, az angol ábécében az A-t a D-vel, a B-t az E-vel stb. kell helyettesíteni.Az elnevezését Julius Caesar után kapta, aki ennek a segítségével kommunikált tábornokaival.(Forrás: Wikipedia)  

Készíts egy `Caesar` nevű osztályt ami az `Encryption`-t implementálja. Egy attribútuma, az eltolás mértéke (offset), ami konstruktorban állítsunk be. Definiáljuk felül az `encrypts()` metódust, a történetnek megfelelően. (commit: ex-w08d04)