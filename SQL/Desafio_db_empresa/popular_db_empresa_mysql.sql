# Professor - Daniel Paiva
# Modelagem de Software

# Primeira Execucao
INSERT INTO departamento
VALUES('Pesquisa', '1', null, '2023-01-01'),
('Tecnologia', '2', null, '2022-01-01'),
('Ciência Dados', '3', null, '2021-01-01'),
('Filial', '4', null, '2020-01-01'),
('Matriz', '5', null, '2010-01-01');

#Segunda Execucao
INSERT INTO funcionario
VALUES('Joao', 'B', 'Silva', '12345678910', '1965-10-01', 'Rua das Flores 761, São Paulo, SP', 'M', '30.000', null, '1'),
('Fernando', 'T', 'Wong', '12345678911', '1970-10-01', 'Rua da Lapa 34, São Paulo, SP', 'M', '40.000', null, '2'),
('Alice', 'J', 'Silva', '22345678912', '1965-11-01', 'Rua Souza Lima 35, Curitiba, PR', 'F', '25.000', null, '1'),
('Jennifer', 'S', 'Souza', '32345678913', '1990-01-01', 'Rua dos Animais 761, São Paulo, SP', 'F', '43.000', null, '2'),
('Ronaldo', 'H', 'Paiva', '42345678914', '1995-01-01', 'Rua Zebra 761, São Paulo, SP', 'M', '38.000', null, '2'),
('Joao', 'K', 'Lima', '52345678915', '1999-01-01', 'Rua Maceio 761, São Paulo, SP', 'M', '25.000', null, '5'),
('Joice', 'A', 'Leite', '62345678916', '1991-01-01', 'Rua Escudo 761, São Paulo, SP', 'F', '25.000', null, '1'),
('Andre', 'V', 'Pereira', '72345678917', '1980-01-01', 'Rua Flecha 761, São Paulo, SP', 'M', '55.000', null, '1'),
('Jorge', 'E', 'Brito', '82345678918', '1940-01-01', 'Rua Arco 761, São Paulo, SP', 'M', '30.000', null, '2'),
('Daniel', 'H', 'Paiva', '92345678919', '1992-11-18', 'Rua da Bahia 100, Belo Horizonte, MG', 'M', '500.000', null, '2'),
('Joao', 'B', 'Silvas', '12345678920', '2001-01-01', 'Rua das Margens 761, São Paulo, SP', 'M', '30.000', null, '4'),
('Jo', 'B', 'Silva', '12345678921', '2003-01-01', 'Rua das Estribeiras 761, São Paulo, SP', 'M', '30.000', null, '1'),
('John', 'B', 'Silva', '12345678922', '2004-01-01', 'Rua das Ervas 761, São Paulo, SP', 'M', '10.000', null, '4'),
('Jesse', 'B', 'Silva', '12345678923', '2005-01-01', 'Rua do Capitao 761, São Paulo, SP', 'M', '15.000', null, '3'),
('Pedro', 'B', 'Silva', '12345678934', '2005-01-01', 'Av Capelinha, São Paulo, SP', 'M', '9.000', null, '3'),
('Samuel', 'B', 'Silva', '52345678934', '2005-01-01', 'Avenida Bernardo 3, São Paulo, SP', 'M', '3.000', null, '3'),
('Heitor', 'B', 'Silva', '72745678934', '2005-01-01', 'Avenida Bernardo 3, São Paulo, SP', 'M', '900.000', null, '5'),
('Marina', 'Z', 'Silva', '17745678960', '2000-10-10', 'Avenida Monte Siao, Belo Horizonte, MG', 'F', '10.000', null, '2'),
('Jucelino', 'P', 'Pereira', '77645678950', '1987-07-07', 'Rua Caetes, Belo Horizonte, MG', 'M', '10.000', null, '2');

#Terceira Execução
Update departamento
set Cpf_gerente = '92345678919'
where Dnumero = 2;

#Quarta Execução
Update departamento
set Cpf_gerente = '22345678912'
where Dnumero = 1;

#Quinta Execução
Update departamento
set Cpf_gerente = '12345678934'
where Dnumero = 3;

#Sexta Execução
Update departamento
set Cpf_gerente = '12345678922'
where Dnumero = 4;

#Sétima Execução
Update departamento
set Cpf_gerente = '72745678934'
where Dnumero = 5;

#Oitava Execução
Update funcionario
set Cpf_supervisor = '92345678919'
where Dnr = 2;

#Nona Execução
Update funcionario
set Cpf_supervisor = '22345678912'
where Dnr = 1;

#Decima Execução
Update funcionario
set Cpf_supervisor = '12345678934'
where Dnr = 3;

#11 Execução
Update funcionario
set Cpf_supervisor = '12345678922'
where Dnr = 4;

#12 Execução
Update funcionario
set Cpf_supervisor = '72745678934'
where Dnr = 5;

######################################################################

#13 Exec
INSERT INTO localizacao_dep
VALUES('1', 'São Paulo'),
('2', 'Belo Horizonte'),
('3', 'Contagem'),
('4', 'Betim'),
('5', 'Rio de Janeiro');


#14 Exec
INSERT INTO dependente
VALUES('12345678910', 'Marcelinho', 'M', '2020-05-06', 'Filho'),
('12345678910', 'Mariazinha', 'F', '2020-05-06', 'Filha'),
('12345678911', 'Roberta', 'F', '2022-12-06', 'Filha'),
('12345678911', 'Vitória', 'F', '2000-04-30', 'Filha'),
('12345678911', 'Amanda', 'F', '2020-05-06', 'Esposa'),
('92345678919', 'Salomão', 'M', '2023-05-17', 'Filho'),
('92345678919', 'Daniela', 'F', '1991-11-01', 'Esposa'),
('22345678912', 'Rodolfo', 'M', '1970-07-07', 'Marido'),
('22345678912', 'Rodolfinho', 'M', '2014-02-19', 'Filho');



#15 Exec
INSERT INTO projeto
VALUES('ProdutoX', '1', 'Santo André', '1'),
('ProdutoY', '2', 'Itu', '1'),
('ProdutoZ', '3', 'São Paulo', '1'),
('Informatização', '10', 'Belo Horizonte', '2'),
('Desenvolvimento', '4', 'Belo Horizonte', '2'),
('Dados', '5', 'Contagem', '3'),
('ProdutoXPTO', '6', 'Mauá', '4'),
('Reorganização', '7', 'Betim', '5');


#16 Execução da Query
INSERT INTO trabalha_em
VALUES('92345678919', '4', '30'),
('92345678919', '5', '2'),
('92345678919', '7', '5'),
('92345678919', '10', '6'),
('12345678910', '1', '20'),
('12345678911', '1', '22'),
('12345678920', '4', '10'),
('12345678921', '3', '20'),
('12345678922', '2', '20'),
('12345678923', '1', '10'),
('12345678934', '1', '20'),
('22345678912', '1', '30'),
('32345678913', '4', '35'),
('42345678914', '2', '25'),
('52345678915', '2', '10'),
('52345678934', '3', '15'),
('62345678916', '4', '35'),
('72345678917', '5', '35'),
('72745678934', '1', '40'),
('82345678918', '2', '35');

