create database CSS
use CSS

create table Aislado(
cod_aislado nchar(5)
	constraint Aislado_cod_aislado_pk primary key,
direccion nvarchar(50)
)

create table Hotel(
cod_aislado nchar(5)
	constraint Hotel_cod_aislado_pk primary key,
nombre nvarchar(30)
)
create table Casa(
cod_aislado nchar(5)
	constraint Casa_cod_aislado_pk primary key,
persona_en_casa nchar(2)
)
create table Cuidado_int(
cod_aislado nchar(5)
	constraint Cuidado_int_cod_aislado_pk primary key,
nombre_hospital nvarchar(40)
)

create table Paciente(
cedula nvarchar(12)
	constraint Paciente_cedula_pk primary key,
 nombre nvarchar(30),
 edad nchar(2),
 sexo nvarchar(10),
 telefono nchar(8),
 direccion nvarchar(50),
 cod_aislado nchar(5)
	constraint Paciente_cod_aislado_fk foreign key(cod_aislado)
	references Aislado(cod_aislado)
)

create table Prueba(
cod_prueba nchar(8)
	constraint Prueba_cod_prueba_pk primary key,
fecha date,
hora time,
resultado nvarchar(8),
cedula nvarchar(12)
	constraint Prueba_cedula_fk foreign key(cedula)
	references Paciente(cedula)
)

create table Medico(
cedula nvarchar(12)
	constraint Medico_cedula_pk primary key,
nombre nvarchar(30),
especialidad nvarchar(30),
direccion nvarchar(50),
telefono nchar(8)
)

create table Medico_Prueba(
cedula nvarchar(12)
	constraint Medico_Prueba_cedula_fk foreign key(cedula)
	references Medico(cedula),
cod_prueba nchar(8)
	constraint Medico_Prueba_cod_prueba_fk foreign key(cod_prueba)
	references Prueba(cod_prueba)
	constraint Medico_Prueba_cedula_cod_prueba_pk primary key(cedula,cod_prueba),
fecha date,
hora time
)

insert into Aislado
values(00123,'Chanis')
insert into Casa 
Values(00123, 4)
insert into Paciente
values('8-929-443', 'Juan Perez', 38, 'Masculino', 3982345, 'Chanis', 00123)
insert into Prueba
values (00001123,'20200705','14:30:00 PM','Positivo','8-929-443')
insert into Medico
values('8-123-456','Maria Espinosa', 'Hospital', 'Bethania', 3982356)
insert into Medico_Prueba
values('8-123-456',00001123,'20200705','14:30:00 PM')

select *
from Paciente
select *
from Prueba
select *
from Medico
select *
from Medico_Prueba 
