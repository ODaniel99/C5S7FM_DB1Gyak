CREATE TABLE GYARTO(adoszam integer PRIMARY KEY, nev varchar(30), telephely varchar(30), irsz varchar(4), varos varchar(40), utca varchar(100));
CREATE TABLE TERMEK(tkod integer PRIMARY KEY, nev varchar(50), ear numeric check(ear>0), gyarto integer, FOREIGN KEY(gyarto) references GYARTO(nev));
CREATE TABLE Egysegek(aru numeric, FOREIGN KEY(aru) references TERMEK(tkod), db numeric check(db>0));
CREATE TABLE Komponens(termek numeric, alkatresz numeric, FOREIGN KEY(termek) references TERMEK(tkod), FOREIGN KEY(alkatresz) references Alkatresz(akod));
CREATE TABLE Alkatresz(akod numeric PRIMARY KEY, nev varchar(50))