-- CREANDO UMA BASE DE DADOS
CREATE DATABASE TW_JDBC;

-- USANDO ESSA BASE DE DADOS
USE tw_jdbc;

-- CRIANDO A TABELA
CREATE TABLE T_CONTATOS
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR (200) NOT NULL,
    email VARCHAR (100) NOT NULL,
	idade INT NOT NULL,
	telefone VARCHAR (12) NOT NULL	
);

SELECT * FROM T_CONTATOS;

-- INSERT
INSERT INTO `tw_jdbc`.`T_CONTATOS` (`nome`, `email`, `idade`, `telefone`) 
VALUES ('Daniel FS', 'dani3l.dxp@gmail.com', '31', '11 983804055');


-- DROP table T_CONTATOS;
