CREATE TABLE personas (
	id SERIAL PRIMARY KEY,
  	nombre varchar(50) NOT NULL,
  	apellido_paterno varchar(50) NOT NULL,
  	apellido_materno varchar(50) NOT NULL,
  	identificacion SERIAL NOT NULL
);

create table ventas (
	id SERIAL PRIMARY KEY,
  	fecha DATE NOT NULL,
  	monto DECIMAL(10,2) NOT NULL,
  	id_cliente SERIAL NOT NULL
);

ALTER TABLE ventas ADD FOREIGN KEY(id_cliente) REFERENCES personas(id); 
