create database JUGUETE
use JUGUETE
create table Cliente(
cod_cl nchar(4) 
	constraint Cliente_cod_cl_pk primary key,
nombre_cl nvarchar(30) not null
)

create table Juguete(
cod_juguete nchar(4)
	constraint Juguete_cod_juguete_pk primary key,
jugetete_nomb nvarchar(30),
precio nchar(6),
cant_exist nchar(4)
)

create table Deuda_cl(
cod_deuda nchar(4)
	constraint Deuda_cl_cod_deuda primary key,
monto_adeudado nchar(5),
abono nchar(5),
fecha datetime,
cod_cl nchar(4)
	constraint Deuda_cl_cod_cl foreign key(cod_cl)
		references Cliente(cod_cl)
)


create table Juguete_separado(
cod_juguete nchar(4)
	constraint Juguete_separado_cod_juguete_fk_pk foreign key(cod_juguete)
		references Juguete(cod_juguete),
cod_cl nchar(4)
	constraint Juguete_separado_cod_cl_fk_pk foreign key(cod_cl)
		references Cliente(cod_cl)
	constraint Juguete_separado_cod_juguete_cod_cl_pk primary key(cod_juguete, cod_cl),
cantidad_sep nchar(4),
cod_deuda nchar(4)
	constraint Juguete_separado_cod_deuda foreign key(cod_deuda)
		references Deuda_cl(cod_deuda)
)

insert into Juguete 
values(0010,'carta uno',13,20)
insert into Juguete 
values(0011, 'muñeca',18,12)
insert into Juguete 
values(0012, 'pingpong',35,40)
insert into Juguete 
values(0013, 'yoyo',20,7)
insert into Juguete 
values(0014, 'ajedrez',9,23)
insert into Juguete 
values(0015, 'rompecabeza',23,10)
insert into Juguete 
values(0016, 'robot',45,16)
insert into Juguete 
values(0017, 'carrito',25,28)
insert into Juguete 
values(0018, 'tennis',50,8)
insert into Juguete 
values(0019, 'football',12,45)

insert Juguete_separado
values(0012,1234,1,9876)

alter table Juguete_separado
nocheck constraint [Juguete_separado_cod_cl_fk_pk]

alter table Juguete_separado
nocheck constraint [Juguete_separado_cod_deuda]

insert Juguete_separado
values(0212,1234,1,9876)