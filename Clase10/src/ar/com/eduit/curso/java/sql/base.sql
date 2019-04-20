drop database if exists colegio;
create database colegio;
use colegio;
create table cursos(
    id int auto_increment primary key,
    titulo varchar(25) not null,
    profesor varchar(25) not null,
    dia enum('Lunes','Martes','Miércoles','Jueves','Viernes'),
    turno enum('Mañana','Tarde','Noche')
);
create table alumnos(
    id int auto_increment primary key,
    nombre varchar(25) not null,
    apellido varchar(25) not null,
    edad int,
    idCurso int
);
alter table alumnos 
add constraint FK_alumnos_idCurso
foreign key(idCurso)
references cursos(id)
on delete cascade;

select * from cursos;

insert into cursos (titulo,profesor,dia,turno) values
    ('PHP','Lopez','Lunes','Noche');

insert into alumnos (nombre,apellido,edad,idCurso) values
('Juan','Lezcano',34,1),
('Javier','Segovia',33,1),
('Maria','Sosa',44,1),
('Melina','Miguel',22,1),
('Lorenzo','Soto',33,1);