create database agenda;

create table contatos(
	id int not null primary key auto_increment,
	nome varchar (100),
	idade int,
	dataCadastro date
)