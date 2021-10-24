CREATE TABLE Tanfolyam(tkod number PRIMARY KEY, ar integer, tipus varchar(30), megnevezes varchar(30));
CREATE TABLE Résztvevő(tajszám number PRIMARY KEY, név varchar(20), lakcim varchar(40));
CREATE TABLE Részvétel(tanKod number, reszKod number, befizetés number(10), foreign key(tanKod) references Tanfolyam(tkod), foreign key(reszKod) references Résztvevő(tajszám));
