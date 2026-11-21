create database Escuela; 
use Escuela;

create table alumno(
cuenta int not null,
aPaterno varchar(40),
aMaterno varchar(40),
nombre varchar(40),
licenciatura varchar(40), 
direccion varchar(40),
telefono varchar(40), 
semestre int not null
);

select * from Alumno;

CREATE USER 'usr_jdbc'@'localhost'
IDENTIFIED BY '123456';

GRANT SELECT, INSERT, UPDATE, DELETE
ON Escuela.*
TO 'usr_jdbc'@'localhost';

java -cp ".;mysql-connector-j-26.10.0.jar" PruebaInsertarAlumno
