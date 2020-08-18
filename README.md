# rectangleapp
https://www.youtube.com/watch?v=Ie5dBCBDIBo&amp;t=3902s

Stwórz aplikacje w SpringBoot, ktora będzie miała klasę encji JPA "Rectangle"
Klasa ma mieć pola: id,height, width

Z użyciem biblioteki Vaddin stwórz UI pozwalający na dodanie niwych prostokątów dp bazy danych.
DOstęp do bazy danych ma być widoczny pod endpointem: "localhost:8090/figureDB
Po ponownym uruchomieniu aplikacji dane w bazie mają zostać usunięte!

Utwórz endpoint, dzięki któremu po przekazaniu w parametrze nazyw figury(prostokąt/trójkąt) 
oraz długości boków zwraca obwód danej figury. np figure=RECTANGLE&a=10&b=20 zwraca 60

W pliku konfiguracyjnym (appliaction.properties) umieść zestaw 4 danych dla prostokątów. Wczytaj je do 
programu w momencie startu, a następnie umieść je w bazie danych.

W GUI umieść pole tekstowe, które w zależności od podanej wartości wyświetla prostokąty z bazy duże i małe.
