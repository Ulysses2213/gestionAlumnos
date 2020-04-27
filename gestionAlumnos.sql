CREATE DATABASE gestiondealumnos;
USE gestiondealumnos;
CREATE TABLE Alumnos(
	nombre Varchar(10), 
	fapellido Varchar(10), 
	sapellido Varchar(10), 
	boleta Varchar(10),
	noeco Varchar(8)
 );

CREATE TABLE Profesores(
	nombre Varchar(10),
	fapellido Varchar(10),
	sapellido Varchar(10),
	noeco Varchar(8),
	numalumnos Varchar(2),
	PRIMARY KEY (noeco)
);
