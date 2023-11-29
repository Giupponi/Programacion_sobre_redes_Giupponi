/*ESTA ES LA BDD QUE COMPARTEN H2 Y MySQL*/
DROP DATABASE IF EXISTS tiendatp;
CREATE DATABASE tiendatp;
USE tiendatp;

DROP TABLE IF EXISTS stock;
CREATE TABLE stock(
	id int primary KEY auto_increment,
	nombre varchar(100),
	descripcion varchar(255),
	precio_compra float,
	precio_venta float,
	cant int,
	discontinuado boolean
);

INSERT INTO stock(nombre, descripcion, precio_compra, precio_venta, cant, discontinuado) VALUES('Vaso', 'Altovaso', 20.00, 30.00, 10, false);