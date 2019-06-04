create table pooCliente (
cpf varchar (11),
nome varchar (40),
endereco varchar (50),
cidade  varchar (20),
uf  varchar (2),
cep  varchar (8),
ddd varchar (2),
telefone varchar (10),
limiteCred double,
limiteDisp double,
CONSTRAINT PK_CPFCLI PRIMARY KEY (cpf)
);

create table pooVendedor (
cpf varchar (11),
nome varchar (40),
endereco varchar (50),
cidade  varchar (20),
uf  varchar (2),
cep  varchar (8),
ddd varchar (2),
telefone varchar (10),
salarioBase double,
taxaComissao double,
CONSTRAINT PK_CPFVEND PRIMARY KEY (cpf)
);


create table pooPedido (
numero varchar (7),
dataEmissao varchar (10),
dataPagto varchar (10),
formaPagto int,
situacao int,
cpfCliente varchar (11),
cpfVendedor varchar (11),
CONSTRAINT PK_NUMERO PRIMARY KEY (numero),
CONSTRAINT FK_PEDIDO_CPFCLIENTE FOREIGN KEY (cpfCliente) REFERENCES pooCliente (cpf),
CONSTRAINT FK_PEDIDO_CPFVENDEDOR FOREIGN KEY (cpfVendedor) REFERENCES pooVendedor (cpf)
);

create table pooItemPedido (
sequencia int,
qtdeVendida int,
numeroPedido varchar (7),
codigoProduto varchar (7),
CONSTRAINT PK_NUMPEDIDO_CODIGOPROD PRIMARY KEY (numeroPedido, codigoProduto)
);

create table pooProduto (
codigo varchar (7),
descricao varchar (100),
qtdeEstoque int,
unidadeMedida varchar (2),
preco int,
estoqueMinimo int,
CONSTRAINT PK_CODIGO PRIMARY KEY (codigo)
);