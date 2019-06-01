
create table pooCliente (
cpf varchar2 (11),
nome varchar2 (40),
endereco varchar2 (50),
cidade  varchar2 (20),
uf  varchar2 (2),
cep  varchar2 (8),
ddd varchar2 (2),
telefone varchar2 (10),
limiteCred number(8,2),
limiteDisp number(8,2)
)
ALTER TABLE pooCliente
ADD CONSTRAINT PK_CPF_CLIENTE
PRIMARY KEY(cpf);

create table pooVendedor (
cpf varchar2 (11),
nome varchar2 (40),
endereco varchar2 (50),
cidade  varchar2 (20),
uf  varchar2 (2),
cep  varchar2 (8),
ddd varchar2 (2),
telefone varchar2 (10),
salarioBase number(8),
taxaComissao number(8)
)
ALTER TABLE pooVendedor
ADD CONSTRAINT PK_CPF_VENDEDOR
PRIMARY KEY(cpf);

create table pooPedido (
numero varchar2 (7),
dataEmissao varchar2 (10),
dataPagto varchar2 (10),
formaPagto number (1),
situacao number (1),
cpfCliente varchar2 (11),
cpfVendedor varchar2 (11)
)
ALTER TABLE pooPedido
ADD CONSTRAINT PK_NUMERO
PRIMARY KEY(numero);

ALTER TABLE pooPedido
ADD CONSTRAINT FK_PEDIDO_CPFCLIENTE
FOREIGN KEY(cpfCliente) REFERENCES pooCliente;

ALTER TABLE pooPedido
ADD CONSTRAINT FK_PEDIDO_CPFVENDEDOR
FOREIGN KEY(cpfVendedor) REFERENCES pooVendedor;

create table pooItemPedido (
sequencia number (5),
qtdeVendida number(8,2),
numeroPedido varchar2 (7),
codigoProduto varchar2 (7)
)
ALTER TABLE pooItemPedido
ADD CONSTRAINT PK_PEDIDO_PRODUTO
PRIMARY KEY(numeroPedido, codigoProduto);

create table pooProduto (
codigo varchar2 (7),
descricao varchar2 (100),
qtdeEstoque number (8,2),
unidadeMedida varchar2 (2),
preco number (8,2),
estoqueMinimo number (8,2)
)
ALTER TABLE pooProduto
ADD CONSTRAINT PK_CODIGO
PRIMARY KEY(codigo);


