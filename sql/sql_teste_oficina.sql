create database oficinasenac;

use oficinasenac;

create table cep(
	cep varchar (12) not null primary key,
    logradouro varchar (60) not null,
    bairro varchar (40) not null,
    cidade varchar (40) not null,
    uf char (2) not null
);

create table cliente(
	idcliente tinyint not null auto_increment primary key,
    cep varchar (12) not null,
    nome tinytext not null,
    telefone varchar (15) not null,
    numero smallint not null,
    complemento tinytext not null,
    foreign key (cep) references cep (cep)
);

create table veiculo(
	placa varchar(7) not null primary key,
    idcliente tinyint not null,
    marca varchar (30) not null,
    modelo varchar (30) not null,
    ano year not null,
    cor varchar (12) not null,
    foreign key (idcliente) references cliente (idcliente)
);

create table servico (
	idservico tinyint not null auto_increment primary key,
    placa varchar(7) not null,
    data_entrada date not null,
    data_saida date not null,
    desc_dano TINYTEXT not null,
    preco double (10,2) not null,
    foreign key (placa) references veiculo (placa)
);

create table peca (
	idpeca tinyint not null auto_increment primary key,
    nome_peca varchar (32) not null,
    preco double(10,2) not null
);

create table profissional(
	idprofissional tinyint not null auto_increment primary key,
    especialidade tinytext not null,
    custo_horas double(10,2)
);

create table servico_profissional (
	idservico_profissional tinyint not null auto_increment primary key,
    idservico tinyint not null,
    idprofissional tinyint not null,
    num_horas time not null,
    foreign key (idservico) references servico (idservico),
    foreign key (idprofissional) references profissional (idprofissional)
);

create table servico_peca(
	idservico_peca tinyint not null auto_increment primary key,
    idpeca tinyint not null,
    idservico tinyint not null,
    qtd_usada tinyint not null,
    foreign key (idpeca) references peca (idpeca),
    foreign key (idservico) references servico (idservico)
);