
# O2 email logs summary
### OPIS
Program jest stworzony w języku java wersji 7.
Jego zadaniem jest podsumowanie logów z poczty O2 i wyswietlenie ich w streszczonej formie.

### URUCHOMIENIE

Program działa w linii komend. 
```sh
 java -cp emailog-1.0-SNAPSHOT.jar org.example.App historia_logow.txt
```
Jako ostatni argument przyjmuje sciezke do pliku z logami.
Przykladowy wynik programu:
````sh

 ŁąCZNA LICZBA LOGOWAŃ 360
 LICZBA UDANYCH PRAWIDŁOWYCH LOGOWAŃ :60
 LICZBA PRÓB WŁAMAŃ DO SKRZYNKI :300  

UżYCIE PROTOKOŁÓW:
WWW     10
IMAP    280
POP3    10
SMTP    60
ALL  :  #####################################
FAIL:   ##############################%   
    
````
