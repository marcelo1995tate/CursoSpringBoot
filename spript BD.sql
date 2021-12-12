drop database if exists cursojava;
create database if not exists  cursojava;
use cursojava;
create table if not exists  usuarios (
									 id int primary key auto_increment,
									 nombre varchar(50) not null,
									 apellido varchar(50) not null,
									 telefono varchar(50) not null,
									 email varchar(250) not null,
                                     password  varchar(50) not null
 ); 
 
 insert into usuarios  (nombre,apellido,telefono,email,password) values ('Marcelo','Zelaya','4691-1341','marcelozelaya95@gmail.com','123abc'); 
 insert into usuarios  (nombre,apellido,telefono,email,password) values ('Andres','Zelaya','1234-1341','andres@gmail.com','123abc'); 
 insert into usuarios  (nombre,apellido,telefono,email,password) values ('Juan','Perez','4321-1341','juan@gmail.com','123abc'); 
 insert into usuarios  (nombre,apellido,telefono,email,password) values ('Maria','Suarez','7898-1341','maria@gmail.com','123abc'); 
 insert into usuarios  (nombre,apellido,telefono,email,password) values ('Ana','Alvarez','8523-1341','ana@gmail.com','123abc');