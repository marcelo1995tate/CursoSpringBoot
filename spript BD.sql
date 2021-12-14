drop database if exists cursojava;
create database if not exists  cursojava;
use cursojava;
create table if not exists  usuarios (
									 id int primary key auto_increment,
									 nombre varchar(50) not null,
									 apellido varchar(50) not null,
									 telefono varchar(50) not null,
									 email varchar(250) not null unique,
                                     password  varchar(255) not null
 ); 
 
 insert into usuarios  (nombre,apellido,telefono,email,password) values ('Andres','Zelaya','1234-1341','andres@gmail.com','123abc');
 insert into usuarios  (nombre,apellido,telefono,email,password) values ('Juan','Perez','4321-1341','juan@gmail.com','1234abc');
 insert into usuarios  (nombre,apellido,telefono,email,password) values ('Maria','Suarez','7898-1341','maria@gmail.com','1235abc');
 insert into usuarios  (nombre,apellido,telefono,email,password) values ('Ana','Alvarez','8523-1341','ana@gmail.com','1236abc');
 insert into usuarios  (nombre,apellido,telefono,email,password) values ('Ultimo','Alvarez','8523-1341','ana2@gmail.com','1237abc');