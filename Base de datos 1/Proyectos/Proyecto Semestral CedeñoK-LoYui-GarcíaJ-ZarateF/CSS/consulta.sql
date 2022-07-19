select *
from [dbo].[Aislado]

select *
from [dbo].[CasaAislado]

select *
from [dbo].[CuidadoIntensivo]

select *
from [dbo].[HotelAislado]

select *
from [dbo].[Medico]

select *
from [dbo].[Medico_Prueba]

select *
from [dbo].[Paciente]

select *
from [dbo].[Prueba]


select distinct especialidad+', '+direccion as 'especialidad y dirección'
from Medico 
order by 1

select *
from medico 
where direccion between 'b' and 'd'

select nombre,
	edad,
	direccion 
from [dbo].[Paciente]
where direccion in ('chanis', 'tumba muerto')


select nombre,
	especialidad,
	telefono 
from [dbo].[Medico]
where nombre like 'j%'

select count(cod_prueba) as 'Total prueba realizada'
from [dbo].[Prueba]
where fecha = '20200505'

select *
from [dbo].[Paciente]
where edad > 30 and direccion = 'tumba muerto'

select avg(persona_en_casa) as 'Promedio de persona en casa'
from [dbo].[CasaAislado]





select m.nombre 
from Medico_Prueba p inner join Medico m
on p.cedula = m.cedula 
where p.fecha ='20200705'


select max(edad) as 'Edad mayor',
	direccion 
from [dbo].[Paciente]
group by direccion 
having max(edad) > 30

create view medico_paciente as 
select m.nombre as 'Nombre médico',
	m.cedula as 'Cédula de médico',
	p.nombre as 'Nombre paciente',
	p.cedula as 'Cédula de paciente',
	r.fecha as 'Fecha de la prueba',
	r.resultado as 'Resultado'
from Medico m inner join Medico_Prueba k
on m.cedula = k.cedula
inner join Prueba r on k.cod_prueba = r.cod_prueba 
inner join Paciente p on r.cedula = p.cedula 

select [Nombre médico],
	[Nombre paciente] ,
	Resultado 
from medico_paciente 
