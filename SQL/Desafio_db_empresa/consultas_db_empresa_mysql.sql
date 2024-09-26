# Recuperar a data de nascimento e o endereço do(s) funcionário(s) cujo nome seja ‘João B. Silva’.
SELECT Datanasc, Endereco
FROM funcionario 
WHERE Pnome = 'João' AND Minicial = 'B' AND Unome = 'Silva';

# Qual a quantidade total de departamentos atualmente na empresa?
SELECT COUNT(Dnumero) 
AS QtdDpt 
FROM departamento;

# Quantos projetos existem no total?
SELECT COUNT(Projnumero) 
AS QtdProj 
FROM projeto;

# Recuperar todos os valores de salários distintos.
SELECT DISTINCT Salario
AS Dsalarios 
FROM funcionario 
ORDER BY Salario ASC;

# Recuperar todos os funcionários cujo endereço esteja em São Paulo, SP.
SELECT *
FROM funcionario
WHERE Endereco LIKE '%São Paulo, SP%';

# Recuperar todos os funcionários no departamento 5 cujo salário esteja entre R$ 30.000 e R$ 40.000.
SELECT *
FROM funcionario
WHERE Dnr = 5 AND Salario BETWEEN 30.000 AND 40.000;

# Quantos homens existem trabalhando na empresa?
SELECT COUNT(Sexo) 
AS QtdHomens
FROM funcionario
WHERE Sexo = 'M';

# Quantas mulheres existem trabalhando na empresa?
SELECT COUNT(Sexo) 
AS QtdMulheres
FROM funcionario
WHERE Sexo = 'F';

# Quantos dependentes existem na empresa?
SELECT COUNT(Nome_dependente)
AS QtdDependentes
FROM dependente;

# Quantos dependentes o professor ‘Daniel H Paiva’ possui?
SELECT COUNT(Nome_dependente)
AS DANHPAIVA
FROM dependente
WHERE Fcpf = 92345678919;

# Qual o nome da esposa do professor?
SELECT Nome_dependente
AS ESPOSA_DANHPAIVA
FROM dependente
WHERE Fcpf = 92345678919 AND Parentesco = 'Esposa';

# Qual o maior salário da empresa?
SELECT MAX(Salario)
AS MaiorSalario
FROM funcionario;

# Qual o menor salário da empresa?
SELECT MIN(Salario)
AS MenorSalario
FROM funcionario;

# Ordene os funcionários pelo seu primeiro nome.
SELECT *
FROM funcionario
ORDER BY Pnome;

#  Qual a quantidade total de pessoas que trabalham no departamento de tecnologia?
SELECT COUNT(Dnr)
AS QtdFnTecno
FROM funcionario
WHERE Dnr = 2;
