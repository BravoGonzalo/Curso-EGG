DROP DATABASE IF EXISTS superheroes;
CREATE DATABASE superheroes CHARACTER SET utf8mb4;
USE superheroes;

CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre VARCHAR(20) NOT NULL
);


CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
  );

insert into creador (id_creador, nombre)values('1', 'Marvel');
insert into creador (id_creador, nombre)values('2', 'DCComics');

insert into personajes values(1,'Brus Banner','Hulk',160,'600 mil',75,98,1962,'Fisico Nuclear',1);
insert into personajes values(2,'Tony Stark','Iron Man',170,'200 mil',70,123,1963,'Inventor Industrial',1);
insert into personajes values(3,'Thor Odinson','Thor',145,'Infinita',100,235,1962,'Rey De Asgard',1);
insert into personajes values(4,'Wanda Maximoff','Bruja Escarlata',170,'100 mil',90,345,1964,'Bruja',1);
insert into personajes values(5,'Carol Danvers','Capitana Marvel',157,'250 mil',85,128,1968,'Oficial De Inteligencia',1);
insert into personajes values(6,'Thanos','Thanos',170,'Infinita',40,306,1972,'Adorador De La Muerte',1);
insert into personajes values(7,'Peter Parker','Spiderman',165,'25 mil',80,74,1962,'Fotografo',1);
insert into personajes values(8,'Steve Rogers','Capitan America',145,600,45,60,1941,'Oficial General',1);
insert into personajes values(9,'Bobby Drake','IceMan',140,'2 mil',64,122,1963,'Contador',1);
insert into personajes values(10,'Barry Allen','Flash',160,'30 mil',120,168,1966,'Cientifico Forence',2);
insert into personajes values(11,'Bruce Wayne','Batman',170,500,32,47,1939,'HombreDeNegocios',2);
insert into personajes values(12,'Clack Kent','Superman',165,'Infinita',120,182,1948,'Reportero',2);
insert into personajes values(13,'Diara Prince','Mujer Maravilla',160,'Infinita',96,127,1949,'Princesa Guerrera',2);
