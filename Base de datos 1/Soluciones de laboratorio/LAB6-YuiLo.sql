create table cliente
(
cod_cliente nchar(4)
constraint cliente_cod_cliete_pk primary key,
nombre nvarchar(30) not null
)

create table proveedor
(
cod_proveedor char(5)
constraint proveedor_cod_proveedor_pk primary key,
nombre_prov varchar(30) not null
)

create table producto
(
cod_product char(4)
constraint producto_cod_product_pk primary key,
nombre_product varchar(20) not null,
proveedor char(5)
constraint producto_proveedor_fk foreign key
references proveedor(cod_proveedor)
)

create table compra
(
cod_product char(4)
constraint compra_cod_product_fk foreign key
references producto (cod_product),
cod_cliente nchar(4)
constraint compra_cod_cliente_fk foreign key
references cliente (cod_cliente),
constraint compra_cod_product_cod_cliente_pk primary key(cod_product,cod_cliente),
cantidad smallint
)
