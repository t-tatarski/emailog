
# O2 email logs summary

----

### OPIS
Program jest stworzony w języku java wersji 8.
Jego zadaniem jest podsumowanie logów z poczty O2 i wyswietlenie ich w streszczonej formie.
Aby uzyskac dane logowania do konta w poczcie o2, zaloguj sie do swojego konta na stronie poczta.o2.pl
Przejdz do zakladki *profil*, dalej bedzie dostepna opcja **Historia logowania** i pobierz *wszystkie logowaia do Twojego konta* (w formie archiwum zip).

### URUCHOMIENIE

Program działa w **linii komend**. 
```sh
 java -cp emailog-1.0-SNAPSHOT.jar org.example.App historia_logow.txt
```
Jako ostatni argument przyjmuje sciezke do pliku z logami.
Forma logów to plik tekstowy o strukturze jak poniżej:
> 1 2022-08-11 09:51:44 123.123.123.123 0 imap FAIL mynick@myemail.com

*gdzie w kazdej linii podane sa: 
Lp   Date   IP    Port   Protocol   Result   Alias*


Przykladowy wynik programu:
````sh

 ŁąCZNA LICZBA LOGOWAŃ :360
 LICZBA UDANYCH PRAWIDŁOWYCH LOGOWAŃ :60
 LICZBA PRÓB WŁAMAŃ DO SKRZYNKI :300  

UżYCIE PROTOKOŁÓW:
WWW     10
IMAP    280
POP3    10
SMTP    60
ALL  :  #####################################
FAIL:   ##############################%   

PORT
46.166.156.170 -> 16 times
61.109.152.175 -> 1 times
82.163.147.48 -> 8 times
...

    
````
