drop database billetera;
create schema billetera;
use billetera;

create table cliente(
	id_cliente int auto_increment primary key,
    rut varchar(10) not null,
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    
    unique(rut)
);

create table cuenta(
	id_cuenta int auto_increment primary key,
    nro_cuenta int not null,
    saldo int not null,
    id_cliente int not null,
    
	foreign key(id_cliente) references cliente(id_cliente) on delete cascade
    
);

create table tipo_transaccion(
	id_tipo int auto_increment primary key,
	nombre_tipo varchar(30)	
);

create table transaccion(
	id_transaccion int auto_increment primary key,
    id_cuenta int not null,
    fecha_transaccion datetime not null,
    monto int not null,
    id_tipo int not null,
    
    foreign key(id_cuenta) references cuenta(id_cuenta) on delete cascade,
    foreign key(id_tipo) references tipo_transaccion(id_tipo) on delete cascade
);

insert into cliente(rut, nombre, apellido)
values('11111111-1', 'Javiera', 'Silva'),
	  ('22222222-2', 'Emma', 'Watson');
      
insert into cuenta(nro_cuenta, saldo,id_cliente)
values(5689, 1000, 1),(5690, 1500, 2);

insert into tipo_transaccion(nombre_tipo)
values('Depósito'),('Retiro');

insert into transaccion(id_cuenta,fecha_transaccion,monto, id_tipo)
values(2,'2023-02-15 16:18:04',100,2),
	  (1,'2024-02-06 04:41:00',1300,2),
      (1,'2024-02-18 01:58:56',100,1);

select * from cliente;
select * from cuenta;
select * from tipo_transaccion;
select * from transaccion;

